package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**Ответ на заявку*/

@Data
@Entity
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String text;

    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    /*@OneToOne
    @JoinColumn(name = "inquiry_id")
    private Inquiry inquiry;*/


}
