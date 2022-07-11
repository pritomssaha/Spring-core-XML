package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Interest;
@Service
public class InterestService {

	@Autowired
	@Qualifier("checking")
	private Interest interest;

	public InterestService(Interest interest) {
		super();
		this.interest = interest;
	}

	public InterestService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

}
