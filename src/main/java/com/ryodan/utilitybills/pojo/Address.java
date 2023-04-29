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

   // @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "street_id")
    private Street street;

    @OneToMany
    private List<User> user;

    //@ToString.Exclude
    /*@OneToOne
    private Accommodation accommodation;*/

    /*@OneToOne
    @JoinColumn(name = "management_company_id")
    private ManagementCompany managementCompany;*/

}
