package com.learn.springdemo;

public class TrackCoach implements Coach {
	
private FortuneService fortuneService;
	
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkout() {
		return "Run 5k today";
	}

	@Override
	public String getFOrtune() {

		return fortuneService.getFortune();
	}
	
	

}
