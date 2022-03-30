package com.eglobal.capacitacion.mock.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eglobal.capacitacion.mock.model.Libro;
import com.eglobal.capacitacion.mock.service.ServiceImpl;
import com.eglobal.capacitacion.mock.service.ServiceLibro;
import com.eglobal.capacitacion.mock.service.impl.ServiceLibroImpl;

@RestController
public class ControllerImpl {

	
	ServiceImpl service_impl;
	
	@Autowired
	public ControllerImpl(ServiceImpl service_impl) {
		this.service_impl=service_impl;
	}

	@Autowired
	ServiceLibro serv_libro;
	
	@GetMapping("/saludo")
	public ResponseEntity<String>get_saludo(){
		return ResponseEntity.ok(service_impl.hola_mundo());
	}
	
	@GetMapping("/libro/listar")
	public ResponseEntity<?>get_libros(){
		return ResponseEntity.ok(serv_libro.obtener_lista());
	} 
	
	@PostMapping("/libro/crear")
	public ResponseEntity<?>post_libro(@RequestBody Libro libro){
		return ResponseEntity.ok(serv_libro.crear_libro(libro));
	}
}
