package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.repository.AccommodationRepository;
import com.ryodan.utilitybills.repository.AddressRepository;
import com.ryodan.utilitybills.repository.PersonalAccountRepository;
import com.ryodan.utilitybills.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccommodationServiceImpl implements AccommodationService {
    private final AccommodationRepository accommodationRepository;
    private final AddressRepository addressRepository;
    private final PersonalAccountRepository personalAccountRepository;

    @Override
    public List<Accommodation> getAllAccommodation() {
        return accommodationRepository.getAccommodations();
    }

    @Override
    public List<Accommodation> getAccommodationsByClientId(Long id) {
        return accommodationRepository.getAccommodationsByClientId(id);
    }

    @Override
    public List<String> getPersonalAccountNumberByAccommodationId(Long id) {
        return null;
    }


}
