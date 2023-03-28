package com.ryodan.utilitybills.pojo;

import java.util.List;

public class City {
    private Long id;
    private String CityName;
    //@ManyToOne
    private Region region;
    //@OneToMany
    private List<Street> streets;
}
