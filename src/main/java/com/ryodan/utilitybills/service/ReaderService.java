package com.ryodan.utilitybills.service;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.Reader;

import java.util.List;

public interface ReaderService {
    List<Reader> getAllReaders();
    List<Reader> getReadersByClientId(Long id);
    List<Reader> getReadersByAccommodationId(Long id);

}
