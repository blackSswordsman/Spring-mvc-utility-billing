package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany
    private List<Street> streets;
}
