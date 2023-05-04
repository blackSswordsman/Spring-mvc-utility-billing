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
    private String periodFor;

    @Column
    private Double prepaid;

    @OneToOne
    @JoinColumn(name = "due_pay_status_id")
    private DuePayStatus duePayStatus;

    @Column
    private Date created;

    @ManyToOne
    @JoinColumn(name = "personalAcc_id")
    private PersonalAccount personalAcc;

    /*@ManyToOne
    @JoinColumn(name = "accommodationId_id")
    private Accommodation accommodation;*/

}
