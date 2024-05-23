/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Emisor;
import pe.edu.upeu.syscenterlife.repositorio.EmisorRepository;

@Service
public class EmisorService {
    
    @Autowired
    EmisorRepository emisorRepository;

    // Método para guardar un nuevo emisor en la base de datos
    public Emisor guardarEntidad(Emisor emisor){
        return emisorRepository.save(emisor);
    }

    // Método para listar todos los emisores en la base de datos
    public List<Emisor> listarEntidad(){
        return emisorRepository.findAll();
    }

    // Método para actualizar la información de un emisor existente en la base de datos
    public Emisor actualizarEntidad(Emisor emisor){
        return emisorRepository.save(emisor);
    }

    // Método para eliminar un emisor de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        emisorRepository.deleteById(id);
    }

    // Método para buscar un emisor por su ID
    public Emisor buscarEmisor(Integer id){
        return emisorRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
