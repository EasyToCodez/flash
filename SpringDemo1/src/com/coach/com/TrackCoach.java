package com.coach.com;

public class TrackCoach implements Coach {
	
	private FortuneService serv;
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	public FortuneService getServ() {
		return serv;
	}

	public void setServ(FortuneService serv) {
		System.out.println("Inside Setter");
		this.serv = serv;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return serv.getFortuneService();
	}

	public TrackCoach() {
		System.out.println("Inside noarg");

		
		// TODO Auto-generated constructor stub
	}

}
