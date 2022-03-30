package com.eglobal.capacitacion.mock.controler;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.eglobal.capacitacion.mock.controler.ControllerImpl;
import com.eglobal.capacitacion.mock.service.ServiceImpl;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class SaludoTest {

	private ControllerImpl controller;
    private ServiceImpl greetingService;

    @Before
    public void setUp() {
        greetingService = Mockito.mock(ServiceImpl.class);
        controller = new ControllerImpl(greetingService);
    }
    

    @Test
    @Order(value = 1)
    @DisplayName("debug: comparando resultado y estatus")
    public void itShouldReturnTheServiceValueWith200StatusCode() {
        Mockito.when(greetingService.hola_mundo()).thenReturn("HolaMundo");
        ResponseEntity<String> httpResponse =  controller.get_saludo();

        Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
        Assert.assertEquals("HolaMundo", httpResponse.getBody());
    }
    
}
