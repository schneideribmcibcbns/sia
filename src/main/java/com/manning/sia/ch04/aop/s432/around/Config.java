package com.manning.sia.ch04.aop.s432.around;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"com.manning.sia.ch04.aop.s432.around"})
@EnableAspectJAutoProxy
public class Config {
	@Bean
	public AudienceWithAroundAdvice audience() {
		return new AudienceWithAroundAdvice();
	}

}
