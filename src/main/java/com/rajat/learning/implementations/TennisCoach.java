package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;


@Component("sillyTennisCoach")
public class TennisCoach implements Coach {
	
	/*
	 * Sample for Field Autowiring
	 * @Autowired
		private LuckyFortuneService luckyFortuneService
	 */
	
	
	
	private LuckyFortuneService luckyFortuneService;
	
	/*
	 * Constructor Autowiring
	 */
	@Autowired
	public TennisCoach(LuckyFortuneService luckyFortuneService) {
		super();
		this.luckyFortuneService = luckyFortuneService;
	}

	public String getDailyWorkouts() {
		return "Practice backhand For 30 Mins";
	}

	public String getFortune() {
		return luckyFortuneService.getTodaysFortune();
	}
	
}
