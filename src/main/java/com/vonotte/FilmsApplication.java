package com.vonotte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FilmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmsApplication.class, args);
	}
}
