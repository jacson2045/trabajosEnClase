/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.UnidMedida;
import pe.edu.upeu.syscenterlife.repositorio.UnidMedidaRepository;

@Service
public class UnidMedidaService {
    
    @Autowired
    UnidMedidaRepository unidMedidaRepository;

    // Método para guardar una nueva unidad de medida en la base de datos
    public UnidMedida guardarEntidad(UnidMedida unidMedida){
        return unidMedidaRepository.save(unidMedida);
    }

    // Método para listar todas las unidades de medida en la base de datos
    public List<UnidMedida> listarEntidad(){
        return unidMedidaRepository.findAll();
    }

    // Método para actualizar la información de una unidad de medida existente en la base de datos
    public UnidMedida actualizarEntidad(UnidMedida unidMedida){
        return unidMedidaRepository.save(unidMedida);
    }

    // Método para eliminar una unidad de medida de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        unidMedidaRepository.deleteById(id);
    }

    // Método para buscar una unidad de medida por su ID
    public UnidMedida buscarUnidMedida(Integer id){
        return unidMedidaRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
