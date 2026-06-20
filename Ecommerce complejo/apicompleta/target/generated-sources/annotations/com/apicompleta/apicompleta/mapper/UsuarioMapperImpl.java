package com.apicompleta.apicompleta.mapper;

import com.apicompleta.apicompleta.dto.UsuarioRequestDTO;
import com.apicompleta.apicompleta.dto.UsuarioResponseDTO;
import com.apicompleta.apicompleta.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-16T18:36:45-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario toEntity(UsuarioRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setEmail( dto.getEmail() );
        usuario.setNombre( dto.getNombre() );
        usuario.setPassword( dto.getPassword() );

        return usuario;
    }

    @Override
    public UsuarioResponseDTO toResponse(Usuario entity) {
        if ( entity == null ) {
            return null;
        }

        UsuarioResponseDTO usuarioResponseDTO = new UsuarioResponseDTO();

        usuarioResponseDTO.setEmail( entity.getEmail() );
        usuarioResponseDTO.setId( entity.getId() );
        usuarioResponseDTO.setNombre( entity.getNombre() );

        return usuarioResponseDTO;
    }
}
