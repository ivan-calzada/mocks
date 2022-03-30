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
import static org.mockito.Mockito.*;
import com.eglobal.capacitacion.mock.service.CalculadoraCloud;
import com.eglobal.capacitacion.mock.service.ServiceImpl;
import com.eglobal.capacitacion.mock.service.impl.Calculadora;

@SpringBootTest
class MockCapacitacionApplicationTests {

	private ServiceImpl greetingService = new ServiceImpl();
	@Test
	void contextLoads() {
		MockCapacitacionApplication.main(new String[] {});
		
	}
	
    @Test
    @Order(value = 1)
    @DisplayName("debug: comparing response")
    public void itShouldSayHolaMundo() {
        Assert.assertEquals("Hola Mundo", greetingService.hola_mundo());
    }
    
    @InjectMocks
    Calculadora calculadora = new Calculadora();//dependiente
    
    @Mock
    CalculadoraCloud cloud;//dependencia

    @Before
    public void init() {
    	//comportamientos predecibles
    	when(cloud.sumar_en_cloud(5,5)).thenReturn(0.0);
    }
	
	@Test
    @Order(value = 1)
    @DisplayName("debug: probando suma cloud")
	public void probar_suma_cloud() {
		assertEquals(0.0, calculadora.sumar_en_cloud(5, 5));
	}
    
}
