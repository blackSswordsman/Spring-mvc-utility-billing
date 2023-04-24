package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "inquiries")
public class Inquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String name;

    @Column
    Date created;

    @Column
    String description;

    @Column
    String status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "personal_account_id")
    private PersonalAccount personalAcc;

    @ManyToOne
    @JoinColumn (name = "inquiry_type_id")
    private InquiryType inquiryType;

    @OneToOne
    @JoinColumn(name = "response_id")
    private Response response;

}
