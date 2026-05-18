package com.apicompleta.apicompleta.controller;

import com.apicompleta.apicompleta.dto.UsuarioRequestDTO;
import com.apicompleta.apicompleta.dto.UsuarioResponseDTO;
import com.apicompleta.apicompleta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> crear(@RequestBody UsuarioRequestDTO dto) {
        return ResponseEntity.ok(usuarioService.crearUsuario(dto));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }
}
