package com.springdemo.one;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		return "practice running for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return "Track coach fortune: "+fortuneService.getFortune();
	}

}
