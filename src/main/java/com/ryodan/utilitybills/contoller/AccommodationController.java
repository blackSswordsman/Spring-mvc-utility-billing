package com.ryodan.utilitybills.contoller;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.repository.AccommodationRepository;
import com.ryodan.utilitybills.service.AccommodationService;
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

    @GetMapping()
    public String getAllAccommodations(Model model) {
        List<Accommodation> accommodations = accommodationService.getAllAccommodation();
        model.addAttribute("accommodations", accommodations);
        return "accommodations";
    }

    @GetMapping("/{clientId}")
    public String getAllAccommodationsForClient(@PathVariable("clientId") Long id, Model model) {
        List<Accommodation> accommodations = accommodationService.getAccommodationsByClientId(id);
        model.addAttribute("accommodations", accommodations);
        return "accommodations";
    }
}
