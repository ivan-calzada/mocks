package com.eglobal.capacitacion.mock.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.eglobal.capacitacion.mock.model.Libro;
import com.eglobal.capacitacion.mock.repository.RepoLibro;

@Repository
public class RepoLibroImpl implements RepoLibro{

	private static final List<Libro>lista_libros = new ArrayList<>();
	
	@PostConstruct
	public void base_datos() {
		lista_libros.addAll( Arrays.asList(new Libro(1, "poo", "oracledocs", 123),
				new Libro(2, "prog. estructurada", "ibmdocs", 321),
				new Libro(3, "react desde 0", "reactdocs", 456)));
	}
	
	@Override
	public List<Libro> obtener_libros() {
		// TODO Auto-generated method stub
		return lista_libros;
	}

	@Override
	public Libro crear_libro(Libro libro) {
		// TODO Auto-generated method stub
		lista_libros.add(libro);
		return  lista_libros.stream().filter(l->l.getId_libro()==libro.getId_libro())
												  .findFirst()
												  .get();
		
	}

}
