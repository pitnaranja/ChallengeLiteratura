package com.alura.libreria.repositorio;

import com.alura.libreria.model.LibroBD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroBDrepositorio extends JpaRepository<LibroBD,Long> {

   Optional<LibroBD> findByTituloContainsIgnoreCase(String titulo);

   List<LibroBD> findTop10ByOrderByDescargasDesc();

   @Query("SELECT DISTINCT l.idiomas FROM LibroBD l")
   List <String> EncontrarlosIdimoas();

}
