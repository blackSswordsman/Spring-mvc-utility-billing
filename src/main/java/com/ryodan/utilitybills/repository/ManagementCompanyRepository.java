package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.ManagementCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementCompanyRepository extends JpaRepository<ManagementCompany,Long> {

}
