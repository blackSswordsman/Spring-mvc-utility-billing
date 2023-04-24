package com.ryodan.utilitybills.service;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.PersonalAccount;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonalAccountService {

        List<PersonalAccount> getAllPersonalAccounts();
        PersonalAccount getPersonalAccountByAccommodationId(Long id);

        String getPersonalAccountNumberByAccommodationId (Long id);

}
