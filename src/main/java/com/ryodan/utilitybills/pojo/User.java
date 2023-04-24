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
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

//    @OneToOne
//    @JoinColumn(name = "worker_id")
//    private Worker worker;

    @OneToOne
    @JoinColumn(name = "login_id")
    private Login login;

}
