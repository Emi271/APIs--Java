package com.apicompleta.apicompleta.mapper;

import com.apicompleta.apicompleta.dto.ProductoDTO;
import com.apicompleta.apicompleta.entity.Producto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-16T18:36:45-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public Producto toEntity(ProductoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( dto.getId() );
        producto.setNombre( dto.getNombre() );
        producto.setPrecio( dto.getPrecio() );

        return producto;
    }

    @Override
    public ProductoDTO toDTO(Producto entity) {
        if ( entity == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setId( entity.getId() );
        productoDTO.setNombre( entity.getNombre() );
        productoDTO.setPrecio( entity.getPrecio() );

        return productoDTO;
    }
}
