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
    private Long accountNum;

    @OneToOne
    @JoinColumn(name = "accommodations")
    private Accommodation accommodation;

    @OneToMany
    @JoinColumn(name = "due_pay")
    private List<DuePay> duePays;

    @OneToMany
    @JoinColumn(name = "inquiry")
    private List<Inquiry> inquiries;

}
