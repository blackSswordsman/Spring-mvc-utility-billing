package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Date;
import java.util.List;
@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String status;

    @Column
    private Date created;

    @Column
    private Date updated;

    @OneToMany(fetch = FetchType.LAZY)
//    @Fetch(FetchMode.JOIN)
    private List<Accommodation> accommodations;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_info_id")
    private PaymentInfo paymentInfo;

    @OneToMany(fetch = FetchType.LAZY)
    private List <Inquiry> inquiry;

    @OneToMany(fetch = FetchType.LAZY)
    private List <Bill> bills;
}
