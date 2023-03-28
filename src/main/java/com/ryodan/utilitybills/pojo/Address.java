package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

/**Адрес*/
@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer houseNum;

    @Column
    private Integer apartment;

    @ManyToOne(targetEntity = Address.class)
    @JoinColumn(name = "street")
    private Street street;

}
