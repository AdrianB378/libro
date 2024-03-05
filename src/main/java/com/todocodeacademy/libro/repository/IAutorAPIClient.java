package com.todocodeacademy.libro.repository;

import com.todocodeacademy.libro.model.Autor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name = "autoresapi", url = "http://localhost:9004/autores")
public interface IAutorAPIClient {
    
    @GetMapping ("/traernombre/{nombreCompleto}")
    public Autor findByNombreCompleto (@PathVariable ("nombreCompleto") String nombreCompleto); // aca estaba getAutor y lo cambie por el mismo nombre 
                                                                                  // del metodo en autor "findByNombreCompleto"
}
