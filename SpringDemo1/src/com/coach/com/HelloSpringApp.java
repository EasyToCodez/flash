package com.coach.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationProperties.xml");
		Coach baseballCoach = context.getBean("coachid", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		//System.out.println(service.getFortuneService());
		context.close();
	}

}
