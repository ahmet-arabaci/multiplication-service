package com.ahmetarabaci.multiplicationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ahmetarabaci.multiplicationservice.service.MultiplicationService;

@RestController
public class MultiplicationController {

	private MultiplicationService service;
	
	@Autowired
	public MultiplicationController(MultiplicationService service) {
		this.service = service;
	}
	
	@GetMapping("/multiply/{x}/{y}")
	public String multiply(@PathVariable("x") int x, @PathVariable("y") int y) {
		return "Multiplication Result: " + x + " * " + y + " => " + service.multiply(x, y);
	}
}
