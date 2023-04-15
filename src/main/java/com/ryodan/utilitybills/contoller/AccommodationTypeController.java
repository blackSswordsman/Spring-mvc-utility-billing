package com.ryodan.utilitybills.contoller;

import com.ryodan.utilitybills.pojo.AccommodationType;
import com.ryodan.utilitybills.service.AccommodationService;
import com.ryodan.utilitybills.service.AccommodationTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accommodationTypes")
@RequiredArgsConstructor
public class AccommodationTypeController {
    private final AccommodationTypeService accommodationTypeService;

    @GetMapping("/{typeId}")
    public String getAccommodationTypeById(@PathVariable("typeId") Long typeId, Model model) {
        AccommodationType accommodationType = accommodationTypeService.getByPrimaryKey(typeId, AccommodationType.class);
        model.addAttribute("accommodationType", accommodationType);
        return "accommodationType";
    }
}
