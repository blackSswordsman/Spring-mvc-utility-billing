package com.ryodan.utilitybills.service;

import com.ryodan.utilitybills.pojo.Accommodation;

import java.util.List;

public interface AccommodationService {
    List<Accommodation> getAllAccommodation();
    List<Accommodation> getAccommodationsByClientId(Long id);

    String getPersonalAccountNumberByAccommodationId (Long id);
}
