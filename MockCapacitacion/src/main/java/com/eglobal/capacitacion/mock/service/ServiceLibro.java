package com.eglobal.capacitacion.mock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eglobal.capacitacion.mock.model.Libro;


public interface ServiceLibro {

	public List<Libro>obtener_lista();
	public Libro crear_libro(Libro libro);
}
