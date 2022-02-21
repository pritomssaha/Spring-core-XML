package com.learn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach trackCoach1=context.getBean("trackCoach", Coach.class);
		Coach trackCoach2=context.getBean("trackCoach", Coach.class);
		//System.out.println(trackCoach1==trackCoach2);
		System.out.println(trackCoach1.getDailyWorkOut());
		context.close();
	}

}
