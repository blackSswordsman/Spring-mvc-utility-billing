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
    @JoinColumn(name = "user")
    private User user;

    @Column
    private String status;

    @Column
    private Date created;

    @Column
    private Date updated;

    @OneToMany
    @JoinColumn(name = "accommodation")
    private List<Accommodation> accommodations;

    @OneToOne
    @JoinColumn(name = "payment_info")
    private PaymentInfo paymentInfo;

    @OneToMany
    @JoinColumn(name = "inquiry")
    private List <Inquiry> inquiry;

    @OneToMany
    @JoinColumn(name = "bills")
    private List <Bill> bills;
}
