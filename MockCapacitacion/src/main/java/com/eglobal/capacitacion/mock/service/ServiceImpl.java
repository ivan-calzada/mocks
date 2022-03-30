package com.eglobal.capacitacion.mock.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ServiceImpl")
public class ServiceImpl {

	public String hola_mundo() {
		return "Hola Mundo";
	}
}
