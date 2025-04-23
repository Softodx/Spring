
package com.Proyecto2.ejemplo2.repository;

import com.Proyecto2.ejemplo2.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
