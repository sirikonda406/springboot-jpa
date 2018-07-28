package com.mahesh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.mahesh.springboot"})
@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootJpaApplication.class, args);
	}
}
