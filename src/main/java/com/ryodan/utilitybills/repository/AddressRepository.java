package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ryodan.utilitybills.utils.SqlTemplate.SELECT_ALL_TEMPLATE;

@Repository
public interface AddressRepository extends JpaRepository <Address,Long> {

   /* List<Address> addresses = entityManager.createNativeQuery(String.
                    format(SELECT_ALL_TEMPLATE, "addresses"),Address.class).getResultList();*/
}
