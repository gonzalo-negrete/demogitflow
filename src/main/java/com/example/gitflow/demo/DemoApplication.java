package com.example.gitflow.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Clase principal que alberga el método main
 *
 * */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hola, este es el commit de Alice");

		int i = 0;
	}
	
	

}
