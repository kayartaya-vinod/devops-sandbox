package co.vinod.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.vinod.entity.Greeting;
import co.vinod.service.GreetingService;

@SpringBootTest
public class TestHelloService {

	@Autowired
	private GreetingService service;

	@Test
	public void testGreetingService() {
		Assertions.assertNotNull(service);
	}
	
	@Test
	public void testGetGreeting() {
		Greeting gr = new Greeting();
		gr.setName("Vinod");
		gr.setMessage("Hello, World!");
		
		Greeting grActual = service.getGreeting();
		Assertions.assertEquals(gr, grActual);
	}
}
