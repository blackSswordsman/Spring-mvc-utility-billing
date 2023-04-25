package com.ryodan.utilitybills.contoller;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.Client;
import com.ryodan.utilitybills.repository.ClientRepository;
import com.ryodan.utilitybills.repository.InquiryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MainController {
    private final ClientRepository clientRepository;
    private final InquiryRepository inquiryRepository;

    @GetMapping
    public String getHomePage() {
        return "accommodations";
    }

    @GetMapping("profile/{clientId}")
    public String getProfilePage(@PathVariable Long clientId, Model model) {
        Client client = clientRepository.getByPrimaryKey(clientId, Client.class);
        //Inquiry sdfsd = inquiryRepository.getByName("sdfsd");
        List<Long> accommodationsIdList = client.getAccommodations().stream()
                .map(Accommodation::getId)
                .collect(Collectors.toList());
        model.addAttribute("accommodationsIdList",accommodationsIdList);
        return "test_acc_old";
    }
}
