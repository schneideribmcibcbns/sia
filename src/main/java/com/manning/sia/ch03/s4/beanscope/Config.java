package com.manning.sia.ch03.s4.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
@ComponentScan(basePackages={"com.manning.sia.ch03.s4.beanscope"})
public class Config {

	@Bean
	@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.INTERFACES)
	public ShoppingCart cart() {
		return new ShoppingCartImpl();
	}
	
}
