package com.ryodan.utilitybills.service;

import com.ryodan.utilitybills.pojo.ManagementCompany;

import java.util.List;

public interface ManagementCompanyService {

    List<ManagementCompany> getALlManagementCompanies ();
    ManagementCompany getManagementCompanyById(Long id);
}
