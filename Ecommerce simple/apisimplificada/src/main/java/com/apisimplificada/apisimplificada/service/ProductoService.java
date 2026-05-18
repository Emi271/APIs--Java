package com.apisimplificada.apisimplificada.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.apisimplificada.apisimplificada.entity.Producto;
import com.apisimplificada.apisimplificada.repository.ProductoRepository;



@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repo;

    public List<Producto> listar() { return repo.findAll(); }
    public Producto guardar(Producto p) { return repo.save(p); }
    public Optional<Producto> buscar(Long id) { return repo.findById(id); }
    public void eliminar(Long id) { repo.deleteById(id); }
}
