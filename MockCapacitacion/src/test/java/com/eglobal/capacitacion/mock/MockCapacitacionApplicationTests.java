package com.eglobal.capacitacion.mock;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.eglobal.capacitacion.mock.service.ServiceImpl;

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
}
