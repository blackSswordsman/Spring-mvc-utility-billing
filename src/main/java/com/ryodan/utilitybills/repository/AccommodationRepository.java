package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.PersonalAccount;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ryodan.utilitybills.utils.SqlTemplate.SELECT_ALL_TEMPLATE;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AccommodationRepository {

    @PersistenceContext
    private final EntityManager entityManager;

    public List<Accommodation> getAccommodations() {
        List<Accommodation> accommodations = entityManager.createNativeQuery(String.format(SELECT_ALL_TEMPLATE, "accommodations"), Accommodation.class).getResultList();
        return accommodations;
    }

    public List<Accommodation> getAccommodationsByClientId(Long id) {
        String HQL = "SELECT a FROM Accommodation a WHERE a.client.id =: clientId";
        List<Accommodation> accommodations = entityManager.createQuery(HQL, Accommodation.class)
                .setParameter("clientId", id)
                .getResultList();
        //log.info(accommodations.toString());
        return accommodations;
    }
    public void save(Accommodation accommodation) {
        entityManager.persist(accommodation);
    }

    public void update(Accommodation accommodationUpdate) {
        entityManager.merge(accommodationUpdate);
    }

    public void delete(Long id) {
        Accommodation accommodation = entityManager.find(Accommodation.class, id);
        entityManager.remove(accommodation);
    }
}
