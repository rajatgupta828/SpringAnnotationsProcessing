package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;

@Component
public class KhoKhoCoach implements Coach {
	
	/*
	 * Setter Dependency Injection Example by Autowiring on any method
	 */
	
	private LuckyFortuneService luckyFortuneService;
	
	
	
	@Autowired
	public void methodInjection(LuckyFortuneService luckyFortuneService) {
		this.luckyFortuneService = luckyFortuneService;
	}

	public String getDailyWorkouts() {
		return "Practice KHO for 1/2 hour";
	}

	public String getFortune() {
		return luckyFortuneService.getTodaysFortune();
	}

}
