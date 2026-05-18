package com.apicompleta.apicompleta.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    private Double precio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
