package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.repository.AccommodationRepository;
import com.ryodan.utilitybills.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccommodationServiceImpl implements AccommodationService {
    private final AccommodationRepository accommodationRepository;

    @Override
    public List<Accommodation> getAllAccommodation() {
        return accommodationRepository.getAccommodations();
    }

    @Override
    public List<Accommodation> getAccommodationsByClientId(Long id) {
        return accommodationRepository.getAccommodationsByClientId(id);
    }

    @Override
    public String getPersonalAccountNumberByAccommodationId(Long id) {
        return null;
    }

}
