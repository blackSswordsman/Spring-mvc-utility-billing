package com.ryodan.utilitybills.pojo;

import java.util.List;

public class Region {
    private Long id;
    private String RegionName;
    //@OneToMany
    private List<City> cities;
}
