package com.coach.com;

public class BaseballCoach implements Coach {
	private HappyFortuneService service;
	private String name;
	private int id;
	public BaseballCoach() {

	}

	public BaseballCoach(HappyFortuneService happy) {
		service = happy;
	}

	public BaseballCoach(String name,int id) {
		this.name = name;
		this.id=id;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting"+(name!=null?name:"Unknown");
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return service.getFortuneService();
	}

}
