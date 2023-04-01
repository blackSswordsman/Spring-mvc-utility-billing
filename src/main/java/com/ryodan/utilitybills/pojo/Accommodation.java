package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

/**Помещение*/
@Data
@Entity
@Table(name = "accommodations")
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="accommodation_type_id")
    private AccommodationType accommodationType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_account_id")
    private PersonalAccount personalAcc;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(fetch = FetchType.LAZY)
    private List <Reader> reader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "management_company_id")
    private ManagementCompany managementCompany;

//TODO check relations

    @OneToMany(fetch = FetchType.LAZY)
    private List<DuePay> duePay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    @Fetch(FetchMode.JOIN)
    private Client client;

}
