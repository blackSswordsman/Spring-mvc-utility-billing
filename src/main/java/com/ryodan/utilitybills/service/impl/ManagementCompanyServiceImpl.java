package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.ManagementCompany;
import com.ryodan.utilitybills.repository.ManagementCompanyRepository;
import com.ryodan.utilitybills.service.ManagementCompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagementCompanyServiceImpl implements ManagementCompanyService {

    private final ManagementCompanyRepository managementCompanyRepository;
    @Override
    public List<ManagementCompany> getALlManagementCompanies() {
        return managementCompanyRepository.findAll();
    }

    public ManagementCompany getManagementCompanyById(Long id){
        return managementCompanyRepository.findById(id).get();
    }
}
