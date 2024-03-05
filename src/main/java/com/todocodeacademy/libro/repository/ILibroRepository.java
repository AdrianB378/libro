package com.todocodeacademy.libro.repository;

import com.todocodeacademy.libro.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, String > { // Aqui cambie Long por String ya que no hay Long
    
}
