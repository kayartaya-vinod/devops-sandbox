package co.vinod.service;

import org.springframework.stereotype.Service;

import co.vinod.entity.Greeting;

@Service
public class GreetingService {

	public Greeting getGreeting() {
		Greeting gr = new Greeting();
		gr.setName("Vinod");
		gr.setMessage("Hello, World!");
		return gr;
	}
}
