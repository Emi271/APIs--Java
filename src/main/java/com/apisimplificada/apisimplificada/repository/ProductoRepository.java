package com.apisimplificada.apisimplificada.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.apisimplificada.apisimplificada.entity.Producto;
@Repository


public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContaining(String nombre);
}
