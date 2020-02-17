package com.springannotations.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:coach.properties")
public class SportConfig {

	//define bean for Fortune Service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define coach bean and inject dependency
	@Bean 
	public ICoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
