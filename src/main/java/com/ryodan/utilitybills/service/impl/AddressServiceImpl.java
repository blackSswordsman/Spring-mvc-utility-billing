package com.ryodan.utilitybills.service.impl;

import com.ryodan.utilitybills.pojo.*;
import com.ryodan.utilitybills.repository.AddressRepository;
import com.ryodan.utilitybills.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.util.Strings;
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
    public String getFullAddressById(Long id) {

        Address address = this.getAddressById(id);
        Street street = address.getStreet();
        City city = street.getCity();
        Region region = city.getRegion();

        String fullAddress = region.getRegionName() + ", " + city.getCityName() + ", " + street.getStreetName()
                + ", д.  " + address.getHouseNum() + " кв. "
                + ", " + address.getApartment();

        return fullAddress;
    }

    public String getConvertedAddressFromAccommodation(Accommodation accommodation) {
        StringBuilder stringBuilder = new StringBuilder();

        Address address = accommodation.getAddress();

        String street = Strings.EMPTY;
        String city = Strings.EMPTY;
        String region = Strings.EMPTY;
        String houseNum = Strings.EMPTY;
        String apartment = Strings.EMPTY;
        String separator = ", ";

        if (address != null && address.getStreet() != null) {
            street = address.getStreet().getStreetName();
        }

        if (address != null && address.getStreet() != null && address.getStreet().getCity() != null) {
            city = address.getStreet().getCity().getCityName();
        }

        if (address != null
                && address.getStreet() != null
                && address.getStreet().getCity() != null
                && address.getStreet().getCity().getRegion() != null) {

            region = address.getStreet().getCity().getRegion().getRegionName();
        }
        if (!region.equals(Strings.EMPTY)) {
            stringBuilder
                    .append(region)
                    .append(separator);
        }
        if (!city.equals(Strings.EMPTY)) {
            stringBuilder.append(city)
                    .append(separator);
        }
        if (!street.equals(Strings.EMPTY)) {
            stringBuilder.append(street);
        }
        return
        stringBuilder.append(", д.  ")
                .append(houseNum)
                .append(" кв. ")
                .append(apartment)
                .toString();
    }
}
