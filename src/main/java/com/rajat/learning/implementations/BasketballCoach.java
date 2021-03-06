package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;


@Component
public class BasketballCoach implements Coach{

	@Autowired
	private LuckyFortuneService luckyFortuneService;

	public String getDailyWorkouts() {
		
		return "Practice Dribbling for 1/2 hour...";
	}

	public String getFortune() {
		return luckyFortuneService.getTodaysFortune();
	}
	
	

}
