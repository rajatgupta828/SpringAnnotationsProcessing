package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;

@Component
public class KabaddiCoach implements Coach {
	
	/*
	 * Setter Dependency Injection Example by Autowiring
	 */
	
	private LuckyFortuneService luckyFortuneService;
	
	
	
	@Autowired
	public void setLuckyFortuneService(LuckyFortuneService luckyFortuneService) {
		this.luckyFortuneService = luckyFortuneService;
	}

	public String getDailyWorkouts() {
		return "Practice Raid for 1/2 hour";
	}

	public String getFortune() {
		return luckyFortuneService.getTodaysFortune();
	}

}
