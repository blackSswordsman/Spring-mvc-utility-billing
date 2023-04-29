package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.Announcement;
import com.ryodan.utilitybills.repository.AnnouncementRepository;
import com.ryodan.utilitybills.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@RequiredArgsConstructor
public class AnnouncementServiceImpl implements AnnouncementService {

    private final AnnouncementRepository announcementRepository;

    @Override
    public List<Announcement> getAllAnnouncements() {
        return announcementRepository.getAllAnnouncements();
    }

    //@Override
    /*public List<Announcement> getAllAnnouncements() {
        return announcementRepository.findAll();
    }*/
}
