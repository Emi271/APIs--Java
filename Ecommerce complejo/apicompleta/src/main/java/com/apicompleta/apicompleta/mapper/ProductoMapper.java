package com.apicompleta.apicompleta.mapper;

import com.apicompleta.apicompleta.dto.ProductoDTO;
import com.apicompleta.apicompleta.entity.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto toEntity(ProductoDTO dto);
    ProductoDTO toDTO(Producto entity);
}
