package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

/**Объявление*/

@Data
@Entity
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String text;

    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "management_company_id")
    private ManagementCompany managementCompany;



}
