package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**Адрес*/
@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer houseNum;

    @Column
    private Integer apartment;

    @ManyToOne(targetEntity = Address.class)
    @JoinColumn(name = "street")
    private Street street;

    @OneToMany
    @JoinColumn(name = "user")
    private List<User> user;

    @OneToOne
    @JoinColumn(name = "accommodation")
    private Accommodation accommodation;

    @OneToOne
    @JoinColumn(name = "management_company")
    private ManagementCompany managementCompany;

}
