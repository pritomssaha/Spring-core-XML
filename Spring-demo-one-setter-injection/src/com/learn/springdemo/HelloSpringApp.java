package com.learn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		
		Coach baseballCoach=context.getBean("baseballCoach", Coach.class);
		//Coach trackCoach=context.getBean("trackCoach", Coach.class);
		TrackCoach trackCoach=context.getBean("trackCoach", TrackCoach.class);
		
		/*
		 * System.out.println(baseballCoach.getDailyworkout());
		 * System.out.println(baseballCoach.getFOrtune());
		 */
		System.out.println(trackCoach.getDailyworkout());
		System.out.println(trackCoach.getFOrtune());
		System.out.println(trackCoach.toString());
		
		
		//close the context
		
		context.close();
	}

}
