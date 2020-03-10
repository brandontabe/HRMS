package com.example.tabe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {
		System.out.println("test1");

		SpringApplication.run(HrmsApplication.class, args);
	}
}
