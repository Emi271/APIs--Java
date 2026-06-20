package com.apisimplificada.apisimplificada.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
    private String nombre;
    private Double precio;
    private Long categoriaId;
}