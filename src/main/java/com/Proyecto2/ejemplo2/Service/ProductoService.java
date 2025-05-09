
package com.Proyecto2.ejemplo2.Service;

import com.Proyecto2.ejemplo2.Model.Producto;

//Tipos de acciones en la tabla
public interface ProductoService {
    Producto newProducto (Producto newProducto);
    Iterable<Producto> getAll();
    Producto modifyProducto (Producto producto);
    Boolean deleteProducto (Long idproduct);
}