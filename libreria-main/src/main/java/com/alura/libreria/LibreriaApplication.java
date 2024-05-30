package com.alura.libreria;

import com.alura.libreria.principal.Principal;

import com.alura.libreria.repositorio.AutorBDRepository;

import com.alura.libreria.repositorio.LibroBDrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication implements CommandLineRunner {
@Autowired// acceso CRUD ( inyeccion de dependencias)
private AutorBDRepository repositorioAutor;// acceso CRUD
	@Autowired
	private LibroBDrepositorio repositorioLibro;// acceso CRUD
	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal= new Principal(repositorioLibro,repositorioAutor );
		//principal.BusquedaInicialArray();
		principal.mostrarMenu();
//		principal.BusquedaLibros();

	}
}
