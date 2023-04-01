package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**Помещение*/
@Data
@Entity
@Table(name = "accommodations")
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="accommodation_type")
    private AccommodationType accommodationType;

    @OneToOne
    @JoinColumn(name = "personal_account")
    private PersonalAccount personalAcc;

    @OneToOne
    @JoinColumn(name = "address")
    private Address address;

    @OneToMany
    @JoinColumn (name = "reader")
    private List <Reader> reader;

    @ManyToOne
    @JoinColumn(name = "owner")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "management_company")
    private ManagementCompany managementCompany;

//TODO check relations

    @OneToMany
    @JoinColumn(name = "due_pay")
    private List<DuePay> duePay;

}
