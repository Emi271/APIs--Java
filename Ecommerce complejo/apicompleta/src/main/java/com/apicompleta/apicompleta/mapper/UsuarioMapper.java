package com.apicompleta.apicompleta.mapper;

import com.apicompleta.apicompleta.dto.UsuarioRequestDTO;
import com.apicompleta.apicompleta.dto.UsuarioResponseDTO;
import com.apicompleta.apicompleta.entity.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    Usuario toEntity(UsuarioRequestDTO dto);
    UsuarioResponseDTO toResponse(Usuario entity);
}
