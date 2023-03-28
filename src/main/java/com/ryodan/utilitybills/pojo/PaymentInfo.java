package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "paymentInfos")
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
}
