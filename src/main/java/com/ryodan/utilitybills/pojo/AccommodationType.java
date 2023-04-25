package com.ryodan.utilitybills.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**Вид Помещения*/
@Data
@Entity
@Table(name = "accommodation_types")
public class AccommodationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @OneToMany
    private List<Accommodation> accommodation;
}
