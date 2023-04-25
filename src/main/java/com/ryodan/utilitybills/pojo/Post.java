package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/**Содержимое Объявления*/

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String name;

    @Column
    String text;

    @Column
    private Date created;

    /*@OneToOne
    @JoinColumn(name = "announcement_id")
    private Announcement announcement;*/

}
