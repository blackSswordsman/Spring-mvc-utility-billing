package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

/**Помещение*/
@Data
@Entity
@Table(name = "accommodations")
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
