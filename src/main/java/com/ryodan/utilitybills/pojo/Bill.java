package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "bills")
public class Bill { //квитанция
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date created;

    @OneToMany
    private Set<BillFile> file;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
