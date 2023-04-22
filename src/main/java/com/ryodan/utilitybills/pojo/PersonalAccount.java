package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "personal_accounts")
public class PersonalAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String accountNum;

    @OneToOne
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodation;

    @OneToMany
    private List<DuePay> duePays;

    @OneToMany
    private List<Inquiry> inquiries;

}
