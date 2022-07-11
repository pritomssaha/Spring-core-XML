package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class InterestService {
	
	@Autowired
	@Qualifier("saving")
	CalculateInterest calculateInterest;
	
	public int getInterest() {
		return this.calculateInterest.calculate();
	}

}
