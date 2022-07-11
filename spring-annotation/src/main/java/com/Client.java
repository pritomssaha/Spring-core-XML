package com;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctc=new ClassPathXmlApplicationContext("beans.xml");
		InterestService interService=ctc.getBean("interestService", InterestService.class);
		System.out.println(interService.getInterest());
		ctc.close();

	}

}
