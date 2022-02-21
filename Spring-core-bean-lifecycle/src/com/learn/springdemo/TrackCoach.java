package com.learn.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Today run 5 miles";
	}
	
	public void initmethod() {
		System.out.println("init method");
	}
	
	public void destroymethod() {
		System.out.println("destroy method");
	}

}
