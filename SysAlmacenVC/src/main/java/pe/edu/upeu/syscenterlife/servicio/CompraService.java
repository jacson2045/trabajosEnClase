/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Compra;
import pe.edu.upeu.syscenterlife.repositorio.CompraRepository;

@Service
public class CompraService {
    
    @Autowired
    CompraRepository compraRepository;

    // Método para guardar una nueva compra en la base de datos
    public Compra guardarEntidad(Compra compra){
        return compraRepository.save(compra);
    }

    // Método para listar todas las compras en la base de datos
    public List<Compra> listarEntidad(){
        return compraRepository.findAll();
    }

    // Método para actualizar la información de una compra existente en la base de datos
    public Compra actualizarEntidad(Compra compra){
        return compraRepository.save(compra);
    }

    // Método para eliminar una compra de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        compraRepository.deleteById(id);
    }

    // Método para buscar una compra por su ID
    public Compra buscarCompra(Integer id){
        return compraRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
