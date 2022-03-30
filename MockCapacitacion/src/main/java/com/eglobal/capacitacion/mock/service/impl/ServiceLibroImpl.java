package com.eglobal.capacitacion.mock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eglobal.capacitacion.mock.model.Libro;
import com.eglobal.capacitacion.mock.repository.RepoLibro;
import com.eglobal.capacitacion.mock.service.ServiceLibro;

@Service
@Qualifier("ServiceLibro")
public class ServiceLibroImpl implements ServiceLibro{

	@Autowired
	RepoLibro libros;

	@Override
	public List<Libro> obtener_lista() {
		// TODO Auto-generated method stub
		return libros.obtener_libros();
	}

	@Override
	public Libro crear_libro(Libro libro) {
		// TODO Auto-generated method stub
		
		return libros.crear_libro(libro);
	}
	
	
}
