package com.todocodeacademy.libro.model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Libro {
    
    @Id
    private String isbn;
    private String titulo;
    private String anioPublicacion;
    private String descripcion;
    @ElementCollection(fetch = FetchType.EAGER)	
    private List <String> listaAutores;// ojo cambiar si es el caso a List

   
   
}
    
    
    
    

