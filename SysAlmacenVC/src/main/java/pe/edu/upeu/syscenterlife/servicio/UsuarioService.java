/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Usuario;
import pe.edu.upeu.syscenterlife.repositorio.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    // Método para guardar un nuevo usuario en la base de datos
    public Usuario guardarEntidad(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    // Método para listar todos los usuarios en la base de datos
    public List<Usuario> listarEntidad(){
        return usuarioRepository.findAll();
    }

    // Método para actualizar la información de un usuario existente en la base de datos
    public Usuario actualizarEntidad(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    // Método para eliminar un usuario de la base de datos dado su ID
    public void eliminarRegEntidad(Long id){
        usuarioRepository.deleteById(id);
    }

    // Método para buscar un usuario por su ID
    public Usuario buscarUsuario(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
