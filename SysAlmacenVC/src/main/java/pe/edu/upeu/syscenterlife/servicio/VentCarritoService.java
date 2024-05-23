/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.VentCarrito;
import pe.edu.upeu.syscenterlife.repositorio.VentCarritoRepository;

@Service
public class VentCarritoService {
    
    @Autowired
    VentCarritoRepository ventCarritoRepository;

    // Método para guardar un nuevo elemento del carrito de venta en la base de datos
    public VentCarrito guardarEntidad(VentCarrito ventCarrito){
        return ventCarritoRepository.save(ventCarrito);
    }

    // Método para listar todos los elementos del carrito de venta en la base de datos
    public List<VentCarrito> listarEntidad(){
        return ventCarritoRepository.findAll();
    }

    // Método para actualizar la información de un elemento del carrito de venta existente en la base de datos
    public VentCarrito actualizarEntidad(VentCarrito ventCarrito){
        return ventCarritoRepository.save(ventCarrito);
    }

    // Método para eliminar un elemento del carrito de venta de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        ventCarritoRepository.deleteById(id);
    }

    // Método para buscar un elemento del carrito de venta por su ID
    public VentCarrito buscarVentCarrito(Integer id){
        return ventCarritoRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
