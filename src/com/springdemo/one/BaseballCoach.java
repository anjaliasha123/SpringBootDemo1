package com.springdemo.one;

public class BaseballCoach implements Coach{
	
private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
