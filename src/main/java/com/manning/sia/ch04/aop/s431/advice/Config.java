package com.manning.sia.ch04.aop.s431.advice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"com.manning.sia.ch04.aop.s431.advice"})
@EnableAspectJAutoProxy
public class Config {
	/* Turn off the comment to try individual pointcut definitions.
	@Bean
	public Audience audience() {
		return new Audience();
	}
	*/
	
	@Bean
	public AudienceWithExplicitPointcut audience() {
		return new AudienceWithExplicitPointcut();
	}

}
