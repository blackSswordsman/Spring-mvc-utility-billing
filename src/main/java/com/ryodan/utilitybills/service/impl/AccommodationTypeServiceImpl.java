package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.AccommodationType;
import com.ryodan.utilitybills.repository.AccommodationTypeRepository;
import com.ryodan.utilitybills.service.AccommodationTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccommodationTypeServiceImpl implements AccommodationTypeService {
    private final AccommodationTypeRepository repository;
    @Override
    public AccommodationType getByPrimaryKey(Long id, Class<AccommodationType> clazz) {
        return repository.getByPrimaryKey(id, clazz);
    }
}
