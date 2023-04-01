package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/**Счетчик*/
@Data
@Entity
@Table(name = "readers")
public class Reader {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String number; //номер счетчика

        @Column
        private Date installed; //дата установки

        @Column
        private Date lastUpdated; //дата последней поверки

        @Column
        private Double lastReading; //прошлые показания

        @Column
        private Double currentReading; //текущие показания

        @Column
        private Date lastReadingDate; //дата последних показаний

        @ManyToOne
        @JoinColumn (name = "reader_type")
        private ReaderType readerType;

        @ManyToOne
        @JoinColumn(name = "reader_unit")
        private ReaderUnit readerUnit;

        @ManyToOne
        @JoinColumn(name = "accommodation")
        private Accommodation accommodation;



}
