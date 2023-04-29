package com.ryodan.utilitybills.contoller;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.Announcement;
import com.ryodan.utilitybills.service.AnnouncementService;
import com.ryodan.utilitybills.wrapper.AccommodationWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/announcements")
@RequiredArgsConstructor
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @GetMapping
    public String getAllAnnouncements(Model model) {
        List < Announcement> announcements = announcementService.getAllAnnouncements();
        model.addAttribute("announcements",announcements);
        return "announcements";
    }
}
