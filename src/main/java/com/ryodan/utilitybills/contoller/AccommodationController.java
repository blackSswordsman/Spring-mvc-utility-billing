package com.ryodan.utilitybills.contoller;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.repository.AccommodationRepository;
import com.ryodan.utilitybills.repository.PersonalAccountRepository;
import com.ryodan.utilitybills.service.AccommodationService;
import com.ryodan.utilitybills.service.AddressService;
import com.ryodan.utilitybills.service.PersonalAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/accommodations")
@RequiredArgsConstructor
public class AccommodationController {
    private final AccommodationService accommodationService;
    private final AddressService addressService;
    private final PersonalAccountService personalAccountService;

   /* @GetMapping()
    public String getAllAccommodations(Long id,Model model) {
        List<Accommodation> accommodations = accommodationService.getAllAccommodation();
        model.addAttribute("accommodations", accommodations);
        //model.addAttribute("FullAddress",addressService.getFullAddressByAccommodationId());
       // model.addAttribute("personalAccount",accommodationService.getPersonalAccountNumberByAccommodationId())

        return "accommodations";
    }*/

    @GetMapping("/{clientId}")
    public String getAllAccommodationsForClient(@PathVariable("clientId") Long id, Model model) {
        List<Accommodation> accommodations = accommodationService.getAccommodationsByClientId(id);
        model.addAttribute("accommodations", accommodations);
        model.addAttribute("accommodationAddress",addressService.getFullAddressByClientId(id));
        return "accommodations";
    }

}
