package com.rajat.learning.implementations;

import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.IFortuneService;

@Component
public class UnluckyFortuneService implements IFortuneService {

	public String getTodaysFortune() {
		return "Oops !! You are unlucky today";
	}

}
