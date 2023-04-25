package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ryodan.utilitybills.utils.SqlTemplate.SELECT_ALL_TEMPLATE;

@Repository
public class ReaderRepository extends CommonRepository<Reader> {

    public List<Reader> getAllReaders() {
        List<Reader> readers = entityManager.createNativeQuery(String.format(SELECT_ALL_TEMPLATE, "accommodations"),
                Reader.class).getResultList();
        return readers;
    }
}
