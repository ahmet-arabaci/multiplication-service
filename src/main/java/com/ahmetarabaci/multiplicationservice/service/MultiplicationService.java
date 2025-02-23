package com.ahmetarabaci.multiplicationservice.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
}
