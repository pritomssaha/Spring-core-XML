package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Interest;
import com.example.demo.model.Saving;
import com.example.demo.service.InterestService;

@Configuration
@ComponentScan("com.example.demo")
public class JavaConfig {
	
	
	/*
	 * @Bean public Saving saving() { return new Saving(10,8); }
	 * 
	 * @Bean public InterestService interestService() { Interest interest=saving();
	 * return new InterestService(interest); }
	 */
	

}
