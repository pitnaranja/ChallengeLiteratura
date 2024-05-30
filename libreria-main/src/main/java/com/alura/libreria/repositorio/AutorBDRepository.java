package com.alura.libreria.repositorio;

import com.alura.libreria.model.AutorBD;
import com.alura.libreria.model.LibroBD;
import com.alura.libreria.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AutorBDRepository extends JpaRepository<AutorBD,Long> {

   Optional <AutorBD> findByNombreContainsIgnoreCase(String nombreAutor);
   @Query("SELECT l FROM LibroBD l JOIN l.autor a WHERE l.titulo LIKE %:nombre%")
   Optional<LibroBD> buscarLibroPorNombre(@Param("nombre") String nombre);

   @Query("SELECT l FROM LibroBD l JOIN l.autor a")
   List<LibroBD> buscarTodosLosLibros();

   @Query("SELECT a FROM AutorBD a WHERE a.deceso > :fecha AND a.nacimiento < :fecha")
   List<AutorBD> buscarAutoresVivos(@Param ("fecha") Integer fecha);
   @Query("SELECT l FROM LibroBD l JOIN l.autor a WHERE l.idiomas = :idioma")
   List<LibroBD> buscarPorIdima(@Param ("idioma") String idioma);



}
