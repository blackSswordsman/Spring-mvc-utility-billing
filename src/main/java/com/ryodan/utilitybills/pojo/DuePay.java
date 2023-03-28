package com.ryodan.utilitybills.pojo;

import java.util.Date;

public class DuePay {
    private Long id;
    private double amountDue;
    private Date periodFor;
    //private double prepaid;
    private String status;
    private Date created;
    //@OneToOne
    private PaymentStatus payment;
    //@ManyToOne
    //hjj
    private PersonalAccount personalAcc;

}
