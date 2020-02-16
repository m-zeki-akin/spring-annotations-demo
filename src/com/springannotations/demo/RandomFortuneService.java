package com.springannotations.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] arr = {"Fortune one!", "Fortune two!", "Fortune three"};
	
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		return arr[rand.nextInt(3)];
	}

}
