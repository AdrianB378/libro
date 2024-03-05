package com.todocodeacademy.libro.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    private Long idAutor;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private List<String> listaLibros;

}
