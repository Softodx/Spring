package com.Proyecto2.ejemplo2.Controller;

import com.Proyecto2.ejemplo2.Model.Producto;
import com.Proyecto2.ejemplo2.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// creacion de "formato" para interactuar en la tabla

@RestController
@RequestMapping("/producto")
public class Productocontroller {
    @Autowired
    private ProductoService ProductoService;
    
    // creacion objeto en la tabla
    @PostMapping("/nuevo")
    public Producto newProducto(@RequestBody Producto producto){
        return this.ProductoService.newProducto(producto);
    }
    
    // mostrar objeto en la tabla
    @GetMapping("/mostrar")
    public Iterable<Producto> getAll(){
        return ProductoService.getAll();
    }
    
    // modificar objeto en la tabla
    @PostMapping("/modificar")
    public Producto updateProducto(@RequestBody Producto producto){
        return this.ProductoService.modifyProducto(producto);
    }
    
    // eliminar objeto en la tabla
    @PostMapping("/{id}")
    public Boolean deleteProducto (@PathVariable(value="id")Long id){
        return this.ProductoService.deleteProducto(id);
    }
}
