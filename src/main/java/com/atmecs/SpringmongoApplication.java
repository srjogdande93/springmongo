package com.atmecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.atmecs.controller")
public class SpringmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoApplication.class, args);
	}
	
	public void run(){}
	
}
