package com.manning.sia.ch03.s5.runtimevalueinjection.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource("classpath:/com/manning/sia/ch03/s5/runtimevalueinjection/properties/application.properties")
@ComponentScan(basePackages= {"com.manning.sia.ch03.s5.runtimevalueinjection.properties"})
public class ExpressiveConfig {

	@Autowired
	Environment env;
	
	@Bean
	public BlankDisc disc() {
		return new BlankDisc(env.getProperty("disc.title", "Rattle and Hum"), env.getProperty("disc.artist", "U2"));
	}
	
	/*
	Other methods from Environment:
	String getProperty(String key)
	String getProperty(String key, String defaultValue)
	T getProperty(String key, Class<T> type)
	T getProperty(String key, Class<T> type, T defaultValue)
	String getRequiredProperties(String key) throws IllegalStateException
	*/
	
	/* 
	Profile info can be retrieved from Environment as well:
	String[] getActiveProfiles()
	String[] getDefaultProfiles()
	boolean acceptsProfiles(String... profiles)
	*/
}
