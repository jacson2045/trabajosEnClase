/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Perfil;
import pe.edu.upeu.syscenterlife.repositorio.PerfilRepository;

@Service
public class PerfilService {
    
    @Autowired
    PerfilRepository perfilRepository;

    // Método para guardar un nuevo perfil en la base de datos
    public Perfil guardarEntidad(Perfil perfil){
        return perfilRepository.save(perfil);
    }

    // Método para listar todos los perfiles en la base de datos
    public List<Perfil> listarEntidad(){
        return perfilRepository.findAll();
    }

    // Método para actualizar la información de un perfil existente en la base de datos
    public Perfil actualizarEntidad(Perfil perfil){
        return perfilRepository.save(perfil);
    }

    // Método para eliminar un perfil de la base de datos dado su ID
    public void eliminarRegEntidad(Long id){
        perfilRepository.deleteById(id);
    }

    // Método para buscar un perfil por su ID
    public Perfil buscarPerfil(Long id){
        return perfilRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
