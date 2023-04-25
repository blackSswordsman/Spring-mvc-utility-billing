package com.ryodan.utilitybills.service;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();
    void saveAddress(Address address);
    Address getAddressById(Long id);
    void deleteAddressById(Long id);

    String getFullAddressByClientId(Long id);
    String getConvertedAddressFromAccommodation(Accommodation accommodation);
}
