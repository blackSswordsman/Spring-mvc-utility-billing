package com.ryodan.utilitybills.pojo;

import java.util.Date;
import java.util.List;

public class Client {
    private Long id;
    // @OneToOne
    private User user;
    private String status;
    private Date created;
    private Date updated;
    //@OneToMany
    private List<Accommodation> accommodations;
    //@OneToOne
    private PaymentInfo paymentInfo;
    //@OneToMany
    private List <Inquiry> inquiry;
    //@OneToMany
    private List <Bill> bills;
}
