package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    private String RegionName;

    @ToString.Exclude
    @OneToMany
    private List<City> cities;
}
