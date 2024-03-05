package com.todocodeacademy.libro.service;


import com.todocodeacademy.libro.model.Libro;
import java.util.List;

public interface ILibroService {
    
    public  List<Libro> getLibros();
    // Se agrega las propiedades de autor
    public void saveLibro(String isbn, String titulo, String anioPublicacion, String descripcion, String nombreCompleto ); 
           
    public void  deleteLibro(String id);

    public  Libro findLibro(String id);

    public void editLibro (String id, Libro libro);
    
    
}
