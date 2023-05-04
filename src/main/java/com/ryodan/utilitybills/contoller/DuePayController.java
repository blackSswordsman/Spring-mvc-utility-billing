package com.ryodan.utilitybills.contoller;


import com.ryodan.utilitybills.pojo.DuePay;
import com.ryodan.utilitybills.service.DuePayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/due_pay")
@RequiredArgsConstructor
public class DuePayController {

    private final DuePayService duePayService;

    @GetMapping
    public String getAllDuePays(Model model) {
        List<DuePay> duePays = duePayService.getAllDuePays();
        model.addAttribute("duePays",duePays);
        return "due_pays";
    }
}
