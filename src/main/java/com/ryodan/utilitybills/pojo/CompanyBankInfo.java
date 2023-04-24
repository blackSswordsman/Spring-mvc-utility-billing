package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

/**Реквизиты УК*/

@Data
@Entity
@Table(name = "company_bank_infos")
public class CompanyBankInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String kpp; //КПП

    @Column
    private String acc; //рас.счет

    @Column
    private String bank;

    @Column
    private String rcbic; //БИК

    @Column
    private String corrAcc; //корр.счет

    @OneToOne
    @JoinColumn(name = "management_company_id")
    private ManagementCompany managementCompany;


}
