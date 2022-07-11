package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Checking implements Interest {
	@Value("4")
	private int duration;
	@Value("15")
	private int roi;

	public Checking(int duration, int roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}

	public Checking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRoi() {
		return roi;
	}

	public void setRoi(int roi) {
		this.roi = roi;
	}

	@Override
	public double calculate(int amount) {
		return amount * roi / duration;
	}

}
