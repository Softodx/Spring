package com.Proyecto2.ejemplo2.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import lombok.Data;

@Entity
@Data

//Creacion de columnas de la tabla "Producto"

public class Producto {
    @Id
    @Column (name="ID_Producto")
    private Long idproduct;
    
    @Column (name="Nombre_Producto", nullable=false, unique=true, length=100)
    private String nomproduct;
    
    @Column (name="Descripcion", length=200)
    private String description;
    
    @Column (name="Precio", nullable=false)
    private BigDecimal price;
    
    @Column (name="Cantidad en Almacen", nullable=false)
    private Long stock;
    
    @Column (name="Categoria", nullable=false, length=100)
    private String category;
    
}
