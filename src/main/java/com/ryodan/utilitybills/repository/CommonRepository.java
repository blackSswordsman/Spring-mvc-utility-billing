package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Accommodation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CommonRepository <D>{
    @PersistenceContext
    EntityManager entityManager;

    public void save(D entity) {
        entityManager.persist(entity);
    }

    public void update(D entity) {
        entityManager.merge(entity);
    }

    public void delete(Long id, Class<D> clazz) {
        D entity = entityManager.find(clazz, id);
        entityManager.remove(entity);
    }

    public D getByPrimaryKey(Long id, Class<D> clazz) {
        return entityManager.find(clazz, id);
    }
}
