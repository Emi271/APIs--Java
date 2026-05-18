package com.apicompleta.apicompleta.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRequestDTO {
    @NotBlank
    private String nombre;

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
