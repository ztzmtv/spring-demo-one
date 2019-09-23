package ru.azmetov.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Конструктор для dependency Injection
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService=theFortuneService;		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in batting practice";
	}

	@Override
	public String getDailyFortune() {
		//
		
		return fortuneService.getFortune();
	}

}
