package com.coach.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationProperties.xml");
		TrackCoach baseballCoach = context.getBean("track", TrackCoach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getFortune()+" "+baseballCoach.getName());
		context.close();
	
	}

}
