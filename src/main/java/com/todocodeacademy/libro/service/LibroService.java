package com.todocodeacademy.libro.service;

import com.todocodeacademy.libro.model.Autor;
import com.todocodeacademy.libro.model.Libro;
import com.todocodeacademy.libro.repository.IAutorAPIClient;
import com.todocodeacademy.libro.repository.ILibroRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository libroRepo;

    @Autowired
    private IAutorAPIClient autoresapi;

    @Override
    public List<Libro> getLibros() {
        return libroRepo.findAll();

    }

    @Override
    public void saveLibro(String isbn, String titulo, String anioPublicacion, String descripcion, String nombreCompleto) {
    
        // FeignClient con su nombre van a consumir nombreCompleto
        // de Autor en la variable aut que lo guardara
        Autor aut = autoresapi.findByNombreCompleto(nombreCompleto); // Aqui estaba "getAutor" lo cambie por "findByNombreCompleto" 

       
        // Obtener el nombre completo del autor
        String autorNombreCompleto = aut.getNombreCompleto();

        // Crear una lista con un solo elemento (el nombre completo del autor)
        List<String> listaAutores = new ArrayList<>();
        listaAutores.add(autorNombreCompleto);

       

        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnioPublicacion(anioPublicacion);
        libro.setDescripcion(descripcion);
        libro.setListaAutores(listaAutores);

        libroRepo.save(libro);

        

    }

    @Override
    public void deleteLibro(String id) {
        libroRepo.deleteById(id);
    }

    @Override
    public Libro findLibro(String id) {
        return libroRepo.findById(id).orElse(null);

    }

    @Override
    public void  editLibro(String id, Libro libroViejo) {

        Libro libroNuevo = this.findLibro(id);
        libroNuevo.setIsbn(libroViejo.getIsbn());
        libroNuevo.setTitulo(libroViejo.getTitulo());
        libroNuevo.setAnioPublicacion(libroViejo.getAnioPublicacion());
        libroNuevo.setDescripcion(libroViejo.getDescripcion());

        libroRepo.save(libroNuevo);

        
    }

   

   
   

}
