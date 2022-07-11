package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationApplication.class, args);
	}
	
	@Bean
	public InterestService interestService() {
		return new InterestService();
	}

}
