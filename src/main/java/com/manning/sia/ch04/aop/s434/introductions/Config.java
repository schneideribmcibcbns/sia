package com.manning.sia.ch04.aop.s434.introductions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"com.manning.sia.ch04.aop.s434.introductions"})
@EnableAspectJAutoProxy
public class Config {
	@Bean
	public EncoreableIntroducer introducer() {
		return new EncoreableIntroducer();
	}

}
