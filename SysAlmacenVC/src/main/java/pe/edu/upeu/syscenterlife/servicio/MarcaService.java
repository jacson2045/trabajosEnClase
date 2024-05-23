
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Marca;
import pe.edu.upeu.syscenterlife.repositorio.MarcaRepository;

@Service
public class MarcaService {

    @Autowired
    MarcaRepository marcaRepository;

    // Método para guardar una nueva marca en la base de datos
    public Marca guardarEntidad(Marca marca) {
        return marcaRepository.save(marca);
    }

    // Método para listar todas las marcas en la base de datos
    public List<Marca> listarEntidad() {
        return marcaRepository.findAll();
    }

    // Método para actualizar la información de una marca existente en la base de datos
    public Marca actualizarEntidad(Marca marca) {
        return marcaRepository.save(marca);
    }

    // Método para eliminar una marca de la base de datos dado su ID
    public void eliminarRegEntidad(Integer id) {
        marcaRepository.deleteById(id);
    }

    // Método para buscar una marca por su ID
    public Marca buscarMarca(Integer id) {
        return marcaRepository.findById(id).orElse(null);
    }

    // Otros métodos de búsqueda pueden ser añadidos según sea necesario
}
