package com.ryodan.utilitybills.service;

import com.ryodan.utilitybills.pojo.AccommodationType;

public interface AccommodationTypeService {
    AccommodationType getByPrimaryKey(Long id, Class<AccommodationType> clazz);
}
