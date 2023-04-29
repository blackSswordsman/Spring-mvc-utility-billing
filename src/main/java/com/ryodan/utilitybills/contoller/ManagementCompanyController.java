package com.ryodan.utilitybills.contoller;


import com.ryodan.utilitybills.pojo.Announcement;
import com.ryodan.utilitybills.pojo.ManagementCompany;
import com.ryodan.utilitybills.pojo.Reader;
import com.ryodan.utilitybills.repository.ManagementCompanyRepository;
import com.ryodan.utilitybills.service.AddressService;
import com.ryodan.utilitybills.service.ManagementCompanyService;
import com.ryodan.utilitybills.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/management-company-info")
@RequiredArgsConstructor
public class ManagementCompanyController {
    private final ManagementCompanyService managementCompanyService;
    private final AddressService addressService;
    private final ManagementCompanyRepository managementCompanyRepository;

    @GetMapping()
    public String getAllManagementCompanies(Model model) {
        List<ManagementCompany> managementCompanies = managementCompanyService.getALlManagementCompanies();
        model.addAttribute("managementCompanies", managementCompanies);
        return "management-company-info";
    }
// TODO на клиенте инф. об 1 УК
    @GetMapping("/{managementCompanyId}")
    public String getAllManagementCompanies(@PathVariable ("managementCompanyId") Long id, Model model) {
        ManagementCompany managementCompany = managementCompanyService.getManagementCompanyById(id);
        model.addAttribute("managementCompany", managementCompany);
        model.addAttribute("address",addressService.getFullAddressById(id));
        return "management-company-info";
    }
}
