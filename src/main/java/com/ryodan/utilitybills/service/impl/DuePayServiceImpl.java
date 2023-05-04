package com.ryodan.utilitybills.service.impl;


import com.ryodan.utilitybills.pojo.DuePay;
import com.ryodan.utilitybills.repository.DuePayRepository;
import com.ryodan.utilitybills.service.DuePayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DuePayServiceImpl implements DuePayService {

    private final DuePayRepository duePayRepository;
    @Override
    public List<DuePay> getAllDuePays() {
        return duePayRepository.getAllDuePays();
    }
}
