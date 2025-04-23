
package com.Proyecto2.ejemplo2.Service;

import com.Proyecto2.ejemplo2.Model.Producto;
import com.Proyecto2.ejemplo2.repository.ProductoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImple implements ProductoService{
    @Autowired
    
    private ProductoRepository productorepository;

    // creacion de metodos para operaciones en la tabla
    
    @Override
    public Producto newProducto(Producto newProducto) {
        return productorepository.save(newProducto);
    }

    @Override
    public Iterable<Producto> getAll() {
        return this.productorepository.findAll();
    }

    @Override
    public Producto modifyProducto(Producto producto) {
        
        Optional<Producto> productoEncontrado=this.productorepository.findById(producto.getIdproduct());
        if(productoEncontrado.get()!=null){
            productoEncontrado.get().setNomproduct(producto.getNomproduct());
            productoEncontrado.get().setDescription(producto.getDescription());
            productoEncontrado.get().setPrice(producto.getPrice());
            productoEncontrado.get().setStock(producto.getStock());
            productoEncontrado.get().setCategory(producto.getCategory());
        }
        return this.newProducto(productoEncontrado.get());
    }

    @Override
    public Boolean deleteProducto(Long idproduct) {
        this.productorepository.deleteById(idproduct);
        return true;
    }
    
}

  