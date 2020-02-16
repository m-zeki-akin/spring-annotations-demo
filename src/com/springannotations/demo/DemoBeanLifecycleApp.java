package com.springannotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBeanLifecycleApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sport-context.xml");

		RandomFortuneService rfs = context.getBean("randomFortuneService", RandomFortuneService.class);

		context.close();

	}

}
