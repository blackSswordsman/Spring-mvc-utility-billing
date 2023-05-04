package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.DuePay;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ryodan.utilitybills.utils.SqlTemplate.SELECT_ALL_TEMPLATE;

@Repository
public class DuePayRepository extends CommonRepository<DuePayRepository>{

    public List<DuePay> getAllDuePays() {
        List<DuePay> duePays = entityManager.createNativeQuery(String.format(SELECT_ALL_TEMPLATE, "due_pays"), DuePay.class).getResultList();
        return duePays;
    }

}
