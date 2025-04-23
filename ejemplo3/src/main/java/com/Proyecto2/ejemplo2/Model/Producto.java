package com.Proyecto2.ejemplo2.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

//Creacion de columnas de la tabla "Producto"

public class Producto {
    @Id
    @Column
    private Long idproduct;
    @Column
    private String nomproduct;
    @Column
    private String description;
    @Column
    private String price;
    @Column
    private Long stock;
    @Column
    private String category;
}
