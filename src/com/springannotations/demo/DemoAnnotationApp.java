package com.springannotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotationApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sport-context.xml");
		
		TennisCoach tennisCoach = context.getBean("TennisCoachComponent", TennisCoach.class);

		System.out.println(tennisCoach.getDailyWorkout());
		
		context.close();
		
	}

}
