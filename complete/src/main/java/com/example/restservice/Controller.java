package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private Service service = new Service();

	@GetMapping("/greeting")
	public Service.Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return  service.new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
    @GetMapping("/cars")
    public Service.Cars cars(@RequestParam(value = "carName", defaultValue = "BMW") String name) {
        return service. new Cars("Jaguar", "Tata Motors");
    }
}
