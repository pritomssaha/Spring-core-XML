package com.learn.springdemo;

public class TrackCoach implements Coach {

	private String emilAddress;
	private String name;

	public String getEmilAddress() {
		return emilAddress;
	}

	public void setEmilAddress(String emilAddress) {
		this.emilAddress = emilAddress;
	}

	@Override
	public String toString() {
		return "TrackCoach [emilAddress=" + emilAddress + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private FortuneService fortuneService;

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
