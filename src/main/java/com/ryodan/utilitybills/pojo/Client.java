package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;

    @Column
    private String status;

    @Column
    private Date created;

    @Column
    private Date updated;
    @OneToMany
    private List<Accommodation> accommodations;
    @OneToOne
    private PaymentInfo paymentInfo;
    @OneToMany
    private List <Inquiry> inquiry;
    @OneToMany
    private List <Bill> bills;
}
