package com.springannotations.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	public void initTennisCoach() {
		System.out.println("Swim Coach Initialized");
	}
	
	@PreDestroy
	public void destroyTennisCoach() {
		System.out.println("Swim Coach Destroyed");
	}
	
	@Value("${SwimCoach.emailAddress}")
	private String emailAddress;
	
	@Value("${SwimCoach.team}")
	private String team;
	
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as warmup.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getTeam() {
		return team;
	}

}
