package com.springannotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotationApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sport-context.xml");
		
		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		TennisCoach newTennisCoach = context.getBean("tennisCoach", TennisCoach.class);

		System.out.println(tennisCoach);
		
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(newTennisCoach);
		
		System.out.println(newTennisCoach.getDailyFortune());
		
		context.close();
		
	}

}
