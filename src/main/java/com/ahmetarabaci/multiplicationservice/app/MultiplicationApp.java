package com.ahmetarabaci.multiplicationservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ahmetarabaci.*"})
@EnableDiscoveryClient
public class MultiplicationApp {

	public static void main(String[] args) {
		SpringApplication.run(MultiplicationApp.class, args);
	}
	
}
