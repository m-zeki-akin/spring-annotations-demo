package com.springannotations.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotationApp {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sport-context.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(tennisCoach.getEmailAddress());
		
		System.out.println(tennisCoach.getTeam());
		
		context.close();
		
	}

}
