package com.apicompleta.apicompleta.service;

import com.apicompleta.apicompleta.dto.UsuarioRequestDTO;
import com.apicompleta.apicompleta.dto.UsuarioResponseDTO;
import com.apicompleta.apicompleta.entity.Usuario;
import com.apicompleta.apicompleta.mapper.UsuarioMapper;
import com.apicompleta.apicompleta.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;  
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public UsuarioResponseDTO crearUsuario(UsuarioRequestDTO dto) {
        Usuario usuario = usuarioMapper.toEntity(dto);
        usuarioRepository.save(usuario);
        return usuarioMapper.toResponse(usuario);
    }

    public List<UsuarioResponseDTO> listarUsuarios() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuarioMapper::toResponse)
                .collect(Collectors.toList());
    }
}
