package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.Reader;
import com.ryodan.utilitybills.repository.ReaderRepository;
import com.ryodan.utilitybills.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor

public class ReaderServiceImpl implements ReaderService {

    private final ReaderRepository readerRepository;
    @Override
    public List<Reader> getAllReaders() {
        return readerRepository.getAllReaders();
    }

    @Override
    public List<Reader> getReadersByClientId(Long id) {
        return null;
    }

    @Override
    public List<Reader> getReadersByAccommodationId(Long id) {
        return null;
    }

}
