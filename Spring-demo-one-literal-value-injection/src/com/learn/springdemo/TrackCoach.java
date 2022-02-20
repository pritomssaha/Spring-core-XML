package com.learn.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String name;
	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		return "TrackCoach [name=" + name + ", emailAddress=" + emailAddress + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public TrackCoach() {
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
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
