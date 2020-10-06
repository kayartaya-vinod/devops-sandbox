package co.vinod.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.vinod.entity.Greeting;
import co.vinod.service.GreetingService;

@CrossOrigin
@RestController
@RequestMapping("/api/hello")
public class HelloController {

	@Autowired
	private GreetingService service;

	@GetMapping(produces = "application/json")
	public Greeting getGreeting() {
		return service.getGreeting();
	}

}
