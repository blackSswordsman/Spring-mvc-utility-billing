package com.ryodan.utilitybills.wrapper;

import com.ryodan.utilitybills.pojo.Accommodation;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccommodationWrapper {
    private Accommodation accommodation;
    private String address;
}

