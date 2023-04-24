package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @Column
    private String cityName;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @ToString.Exclude
    @OneToMany
    private List<Street> streets;
}
