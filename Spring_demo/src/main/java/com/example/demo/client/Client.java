package com.example.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.JavaConfig;
import com.example.demo.service.InterestService;

public class Client {

	public static void main(String[] args) {
		//ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		//InterestService i= (InterestService) context.getBean("interestService");
		InterestService i=  (InterestService) context.getBean("interestService");
		System.out.println(i.getInterest().calculate(500));

	}

}
