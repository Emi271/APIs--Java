package com.apicompleta.apicompleta.service;

import com.apicompleta.apicompleta.dto.ProductoDTO;
import com.apicompleta.apicompleta.entity.Producto;
import com.apicompleta.apicompleta.mapper.ProductoMapper;
import com.apicompleta.apicompleta.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoMapper productoMapper;

    public ProductoDTO crearProducto(ProductoDTO dto) {
        Producto producto = productoMapper.toEntity(dto);
        productoRepository.save(producto);
        return productoMapper.toDTO(producto);
    }

    public List<ProductoDTO> listarProductos() {
        return productoRepository.findAll()
                .stream()
                .map(productoMapper::toDTO)
                .collect(Collectors.toList());
    }
}
