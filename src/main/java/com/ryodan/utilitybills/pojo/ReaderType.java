package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**Вид Счетчика*/

@Data
@Entity
@Table(name = "reader_types")

public class ReaderType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany
    @JoinColumn(name = "reader")
    private List<Reader> readers;
}
