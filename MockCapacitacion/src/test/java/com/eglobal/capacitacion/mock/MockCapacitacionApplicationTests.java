package com.eglobal.capacitacion.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;

import com.eglobal.capacitacion.mock.controler.ControllerImpl;
import com.eglobal.capacitacion.mock.service.CalculadoraCloud;
import com.eglobal.capacitacion.mock.service.ServiceImpl;
import com.eglobal.capacitacion.mock.service.impl.Calculadora;


@SpringBootTest
class MockCapacitacionApplicationTests {

	@InjectMocks
	private ControllerImpl controller= new ControllerImpl();
    
	@Mock
	private ServiceImpl greetingService;
	
	private ServiceImpl greetingService2 = new ServiceImpl();
	@Test
	void contextLoads() {
		MockCapacitacionApplication.main(new String[] {});
		
	}
	
    @Test
    @Order(value = 1)
    @DisplayName("debug: comparing response")
    public void itShouldSayHolaMundo() {
    	System.out.println(greetingService2.hola_mundo());
        Assert.assertEquals("Hola Mundo", greetingService2.hola_mundo());
    }
    
    @InjectMocks
    Calculadora calculadora = new Calculadora();//dependiente
    
    @Mock
    CalculadoraCloud cloud;//dependencia

    @Before
    public void init() {
    	//comportamientos predecibles
    	when(cloud.sumar_en_cloud(5.0,5.0)).thenReturn(10.0);
    	
    }
	
	@Test
    @Order(value = 2)
    @DisplayName("debug: probando suma cloud")
	public void probar_suma_cloud() {
		assertEquals(0.0, calculadora.sumar_en_cloud(5.0, 5.0));
	}
	
	@Test
    @Order(value = 3)
    @DisplayName("debug: comparando resultado y estatus")
    public void itShouldReturnTheServiceValueWith200StatusCode() {
		when(greetingService.hola_mundo()).thenReturn("Hola Mundo");
		verify(greetingService).hola_mundo();
    }
}
