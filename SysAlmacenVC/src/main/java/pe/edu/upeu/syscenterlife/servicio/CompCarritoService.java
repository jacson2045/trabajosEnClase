
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.CompCarrito;
import pe.edu.upeu.syscenterlife.repositorio.CompCarritoRepository;

@Service
public class CompCarritoService {
    
    @Autowired
    CompCarritoRepository compCarritoRepository;

    // Método para guardar una nueva entrada de compra en el carrito en la base de datos
    public CompCarrito guardarEntidad(CompCarrito compCarrito){
        return compCarritoRepository.save(compCarrito);
    }

    // Método para listar todas las entradas de compra en el carrito en la base de datos
    public List<CompCarrito> listarEntidad(){
        return compCarritoRepository.findAll();
    }

    // Método para actualizar la información de una entrada de compra en el carrito existente en la base de datos
    public CompCarrito actualizarEntidad(CompCarrito compCarrito){
        return compCarritoRepository.save(compCarrito);
    }

    // Método para eliminar una entrada de compra del carrito de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id){
        compCarritoRepository.deleteById(id);
    }

    // Método para buscar una entrada de compra del carrito por su ID
    public CompCarrito buscarCompCarrito(Integer id){
        return compCarritoRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
