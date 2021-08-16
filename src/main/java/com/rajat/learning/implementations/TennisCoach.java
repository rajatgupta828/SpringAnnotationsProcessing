package com.rajat.learning.implementations;

import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;


@Component("sillyTennisCoach")
public class TennisCoach implements Coach {

	public String getDailyWorkouts() {
		return "Practice backhand For 30 Mins";
	}
	
}
