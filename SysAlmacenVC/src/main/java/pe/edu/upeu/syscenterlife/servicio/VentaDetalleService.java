/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.VentaDetalle;
import pe.edu.upeu.syscenterlife.repositorio.VentaDetalleRepository;

@Service
public class VentaDetalleService {
    
    @Autowired
    VentaDetalleRepository ventaDetalleRepository;

    // Método para guardar un nuevo detalle de venta en la base de datos
    public VentaDetalle guardarEntidad(VentaDetalle ventaDetalle){
        return ventaDetalleRepository.save(ventaDetalle);
    }

    // Método para listar todos los detalles de venta en la base de datos
    public List<VentaDetalle> listarEntidad(){
        return ventaDetalleRepository.findAll();
    }

    // Método para actualizar la información de un detalle de venta existente en la base de datos
    public VentaDetalle actualizarEntidad(VentaDetalle ventaDetalle){
        return ventaDetalleRepository.save(ventaDetalle);
    }

    // Método para eliminar un detalle de venta de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        ventaDetalleRepository.deleteById(id);
    }

    // Método para buscar un detalle de venta por su ID
    public VentaDetalle buscarVentaDetalle(Integer id){
        return ventaDetalleRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
