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
    @JoinColumn(name = "client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "personal_aacount")
    private PersonalAccount personalAcc;

    @ManyToOne
    @JoinColumn (name = "inquiry_type")
    private InquiryType inquiryType;

    @OneToOne
    @JoinColumn(name = "response")
    private Response response;

}
