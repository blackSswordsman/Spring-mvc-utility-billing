package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String surname;

    @Column
    private String name;

    @Column
    private String middleName;

    @Column
    private String phoneNumber;

    //User-role

    @ManyToOne
    @JoinColumn(name = "address")
    private Address address;

    @OneToOne
    @JoinColumn(name = "client")
    private Client client;

    @OneToOne
    @JoinColumn(name = "worker")
    private Worker worker;

    @OneToOne
    @JoinColumn(name = "login")
    private Login login;

}
