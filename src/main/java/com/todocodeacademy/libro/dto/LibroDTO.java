package com.todocodeacademy.libro.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibroDTO {
    
    private String isbn;
    private String titulo;
    private String anioPublicacion;
    private String descripcion;
    private String nombreCompleto;
    private String nacionalidad;
  
}
