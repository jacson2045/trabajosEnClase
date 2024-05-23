/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Producto;
import pe.edu.upeu.syscenterlife.repositorio.ProductoRepository;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;

    // Método para guardar un nuevo producto en la base de datos
    public Producto guardarEntidad(Producto producto){
        return productoRepository.save(producto);
    }

    // Método para listar todos los productos en la base de datos
    public List<Producto> listarEntidad(){
        return productoRepository.findAll();
    }

    // Método para actualizar la información de un producto existente en la base de datos
    public Producto actualizarEntidad(Producto producto){
        return productoRepository.save(producto);
    }

    // Método para eliminar un producto de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        productoRepository.deleteById(id);
    }

    // Método para buscar un producto por su ID
    public Producto buscarProducto(Integer id){
        return productoRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
