package com.apicompleta.apicompleta.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
