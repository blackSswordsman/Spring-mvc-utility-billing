package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.PersonalAccount;
import com.ryodan.utilitybills.repository.PersonalAccountRepository;
import com.ryodan.utilitybills.service.PersonalAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class PersonalAccountServiceImpl implements PersonalAccountService {

    private final PersonalAccountRepository personalAccountRepository;

    @Override
    public List<PersonalAccount> getAllPersonalAccounts() {
        return personalAccountRepository.findAll();
    }

    @Override
    public PersonalAccount getPersonalAccountByAccommodationId(Long id) {
        return personalAccountRepository.findById(id).get();
    }

    @Override
    public String getPersonalAccountNumberByAccommodationId(Long id) {
        return personalAccountRepository.findById(id).get().getAccountNum();
    }
}
