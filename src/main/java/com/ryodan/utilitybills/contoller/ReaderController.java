package com.ryodan.utilitybills.contoller;

import com.ryodan.utilitybills.pojo.Announcement;
import com.ryodan.utilitybills.pojo.Reader;
import com.ryodan.utilitybills.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/readers")
@RequiredArgsConstructor
public class ReaderController {
    private final ReaderService readerService;

    @GetMapping
    public String getAllReaders(Model model) {
        List<Reader> readers = readerService.getAllReaders();
        model.addAttribute("readers",readers);
        return "readers";
    }
}
