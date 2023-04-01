package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

/**Вид Заявки*/

@Data
@Entity
@Table(name = "inquiry_types")
public class InquiryType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "inquiry")
    private Inquiry inquiry;
}
