package com.eglobal.capacitacion.mock.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import com.eglobal.capacitacion.mock.service.impl.Calculadora;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class CalculadoraTest {
	
	Calculadora calculadora;
	
	@Test
    @Order(value = 1)
    @DisplayName("debug: probando suma cloud")
	public void probar_suma_cloud() {
		assertEquals(10.0, calculadora.sumar_en_cloud(5, 5));
	}

}
