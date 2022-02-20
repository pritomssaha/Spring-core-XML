package com.learn.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	

	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getFOrtune() {
		return this.fortuneService.getFortune();
	}
	
	



	@Override
	public String getDailyworkout() {
		return "spend 30 minutes on batting practice";
	}

}
