package com.learn.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyworkout() {
		return "spend 30 minutes on batting practice";
	}

}
