/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Proveedor;
import pe.edu.upeu.syscenterlife.repositorio.ProveedorRepository;

@Service
public class ProveedorService {
    
    @Autowired
    ProveedorRepository proveedorRepository;

    // Método para guardar un nuevo proveedor en la base de datos
    public Proveedor guardarEntidad(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }

    // Método para listar todos los proveedores en la base de datos
    public List<Proveedor> listarEntidad(){
        return proveedorRepository.findAll();
    }

    // Método para actualizar la información de un proveedor existente en la base de datos
    public Proveedor actualizarEntidad(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }

    // Método para eliminar un proveedor de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        proveedorRepository.deleteById(id);
    }

    // Método para buscar un proveedor por su ID
    public Proveedor buscarProveedor(Integer id){
        return proveedorRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
