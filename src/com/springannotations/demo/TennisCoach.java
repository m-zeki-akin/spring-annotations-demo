package com.springannotations.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void initTennisCoach() {
		System.out.println("Tennis Coach Initialized");
	}
	
	@PreDestroy
	public void destroyTennisCoach() {
		System.out.println("Tennis Coach Destroyed");
	}
	
	@Value("${TennisCoach.emailAddress}")
	private String emailAddress;
	
	@Value("${TennisCoach.team}")
	private String team;
	
	public TennisCoach() {
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
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
