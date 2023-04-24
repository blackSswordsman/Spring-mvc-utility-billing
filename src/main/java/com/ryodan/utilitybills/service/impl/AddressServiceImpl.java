package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.Address;
import com.ryodan.utilitybills.pojo.City;
import com.ryodan.utilitybills.pojo.Region;
import com.ryodan.utilitybills.pojo.Street;
import com.ryodan.utilitybills.repository.AddressRepository;
import com.ryodan.utilitybills.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.getReferenceById(id);
    }

    @Override
    public void deleteAddressById(Long id) {
        deleteAddressById(id);
    }

    @Override
    public String getFullAddressByClientId (Long id) {

        Address address=this.getAddressById(id);
        Street street = address.getStreet();
        City city = street.getCity();
        Region region = city.getRegion();

        String fullAddress = region.getRegionName() + ", " + city.getCityName() + ", " + street.getStreetName()
                 + ", д.  " + address.getHouseNum() + " кв. "
                + ", " + address.getApartment();

        return fullAddress;
    }
}
