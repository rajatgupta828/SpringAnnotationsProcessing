package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;
import com.rajat.learning.interfaces.IFortuneService;

@Component
public class BadmintonCoach implements Coach {
	
	/*
	 * Qualifier example, this will implement @Qualifier annotations
	 */
	
	private IFortuneService hello;
	

	@Autowired
	@Qualifier("unluckyFortuneService")
	public void setLuckyFortuneService(IFortuneService blablaFortuneService) {
		this.hello = blablaFortuneService;
	}

	public String getDailyWorkouts() {
		return "Practice Service Shuttle for 1/2 hour";
	}

	public String getFortune() {
		return hello.getTodaysFortune();
	}

}
