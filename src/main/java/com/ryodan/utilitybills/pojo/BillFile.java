package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bill_files")
public class BillFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bill")
    private Bill bill;

    @Column
    private String filePath;
}
