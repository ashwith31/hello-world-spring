package com.bridgelabz;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloWorldSpringApplication {

	public static final Logger logger = LoggerFactory.getLogger(HelloWorldSpringApplication.class);


	public static void main(String[] args) {
		logger.debug("Hello World!!");
		SpringApplication.run(HelloWorldSpringApplication.class, args);
	}
}
