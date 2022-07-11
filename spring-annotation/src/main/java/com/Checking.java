package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Checking implements CalculateInterest{

	@Value("4")
	private int duration;
	@Value("4")
	private int roi;
	
	
	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return this.duration*this.roi/100;
	}
	
	
}
