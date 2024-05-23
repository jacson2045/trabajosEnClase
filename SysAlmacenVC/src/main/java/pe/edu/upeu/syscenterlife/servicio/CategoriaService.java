/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Categoria;
import pe.edu.upeu.syscenterlife.repositorio.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    CategoriaRepository categoriaRepository;

    // Método para guardar una nueva categoría en la base de datos
    public Categoria guardarEntidad(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    // Método para listar todas las categorías en la base de datos
    public List<Categoria> listarEntidad(){
        return categoriaRepository.findAll();
    }

    // Método para actualizar la información de una categoría existente en la base de datos
    public Categoria actualizarEntidad(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    // Método para eliminar una categoría de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        categoriaRepository.deleteById(id);
    }

    // Método para buscar una categoría por su ID
    public Categoria buscarCategoria(Integer id){
        return categoriaRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
