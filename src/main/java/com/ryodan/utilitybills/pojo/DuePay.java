package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
/**Начисления / к оплате*/
@Data
@Entity
@Table(name = "due_pays")
public class DuePay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double amountDue;

    @Column
    private Date periodFor;

    @Column
    private Double prepaid;

    @Column
    private String status;

    @Column
    private Date created;

    @OneToOne
    @JoinColumn(name = "payment")
    private PaymentStatus payment;

    @ManyToOne
    @JoinColumn(name = "personalAcc")
    private PersonalAccount personalAcc;

    @ManyToOne
    @JoinColumn(name = "accommodation")
    private Accommodation accommodation;

}
