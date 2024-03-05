
package com.todocodeacademy.libro.controller;


import com.todocodeacademy.libro.dto.LibroDTO;
import com.todocodeacademy.libro.model.Libro;
import com.todocodeacademy.libro.service.ILibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/libros")
@RestController
public class LibroController {
    
    @Autowired
    private ILibroService libroServ;
    
    @GetMapping("/traer")
    public List<Libro> getLibros() {
        
        return libroServ.getLibros();
        
        
    
    }
    
    @PostMapping ("/crear")
    public String saveLibro(@RequestBody LibroDTO libro) {
        
       libroServ.saveLibro(libro.getIsbn(), libro.getTitulo(), libro.getAnioPublicacion(), libro.getDescripcion(), libro.getNombreCompleto());
        
        
        return "Libro creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteLibro(@PathVariable String id) {
        libroServ.deleteLibro(id);
        
        return "El libro se ha eliminado correctamente";
        
        
    }
    
    @PutMapping("/editar/{id}")
    public String editLibro (@PathVariable String id, @RequestBody Libro libro) {
        libroServ.editLibro(id, libro);
        return"El libro se ha editado correctamente";
    } 
    
}
