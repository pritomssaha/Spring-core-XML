package com.learn.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public BaseballCoach() {
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
