package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**Управляющая Компания*/

@Data
@Entity
@Table(name = "management_companies")
public class ManagementCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    //TODO data type
    @Column
    private String idNumber; //ИНН

    @Column
    private String RepName; //ФИО представителя

    @Column
    private String phoneNumber;

    @Column
    private String regNumber; //ОГРН

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany
    private List<Worker> workers;

    @OneToMany
    private List<Accommodation> accommodations;


    @OneToMany
    private List<Announcement> announcements;

    @OneToOne
    @JoinColumn(name = "company_bank_info_id")
    private CompanyBankInfo companyBankInfo;

}
