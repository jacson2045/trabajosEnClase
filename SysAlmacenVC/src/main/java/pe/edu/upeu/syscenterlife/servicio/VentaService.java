/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Venta;
import pe.edu.upeu.syscenterlife.repositorio.VentaRepository;

@Service
public class VentaService {
    
    @Autowired
    VentaRepository ventaRepository;

    // Método para guardar una nueva venta en la base de datos
    public Venta guardarEntidad(Venta venta){
        return ventaRepository.save(venta);
    }

    // Método para listar todas las ventas en la base de datos
    public List<Venta> listarEntidad(){
        return ventaRepository.findAll();
    }

    // Método para actualizar la información de una venta existente en la base de datos
    public Venta actualizarEntidad(Venta venta){
        return ventaRepository.save(venta);
    }

    // Método para eliminar una venta de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        ventaRepository.deleteById(id);
    }

    // Método para buscar una venta por su ID
    public Venta buscarVenta(Integer id){
        return ventaRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
