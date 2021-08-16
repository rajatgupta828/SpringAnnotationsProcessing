package com.rajat.learning.implementations;

import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;


@Component
public class BasketballCoach implements Coach{

	public String getDailyWorkouts() {
		
		return "Practice Dribbling for 1/2 hour...";
	}
	
	

}
