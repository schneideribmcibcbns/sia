package com.manning.sia.ch03.s3.ambiguity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.manning.sia.ch03.s3.ambiguity"})
public class Config {

	@Bean
	public Diner dinner() {
		return new Diner();
	}
}
