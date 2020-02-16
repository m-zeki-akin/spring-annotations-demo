package com.springannotations.demo;

import org.springframework.stereotype.Component;

@Component("TennisCoachComponent")
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

}
