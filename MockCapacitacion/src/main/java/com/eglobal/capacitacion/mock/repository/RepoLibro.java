package com.eglobal.capacitacion.mock.repository;

import java.util.List;
import com.eglobal.capacitacion.mock.model.Libro;

public interface RepoLibro {
	
	public List<Libro> obtener_libros();
	public Libro crear_libro(Libro libro);
	
}
