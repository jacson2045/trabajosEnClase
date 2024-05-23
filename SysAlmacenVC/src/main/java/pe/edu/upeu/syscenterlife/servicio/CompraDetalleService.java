/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.CompraDetalle;
import pe.edu.upeu.syscenterlife.repositorio.CompraDetalleRepository;

@Service
public class CompraDetalleService {
    
    @Autowired
    CompraDetalleRepository compraDetalleRepository;

    // Método para guardar un nuevo detalle de compra en la base de datos
    public CompraDetalle guardarEntidad(CompraDetalle compraDetalle){
        return compraDetalleRepository.save(compraDetalle);
    }

    // Método para listar todos los detalles de compra en la base de datos
    public List<CompraDetalle> listarEntidad(){
        return compraDetalleRepository.findAll();
    }

    // Método para actualizar la información de un detalle de compra existente en la base de datos
    public CompraDetalle actualizarEntidad(CompraDetalle compraDetalle){
        return compraDetalleRepository.save(compraDetalle);
    }

    // Método para eliminar un detalle de compra de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        compraDetalleRepository.deleteById(id);
    }

    // Método para buscar un detalle de compra por su ID
    public CompraDetalle buscarCompraDetalle(Integer id){
        return compraDetalleRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
