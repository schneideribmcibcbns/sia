package com.manning.sia.ch02.s2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	// @Bean(name="lonelyHeartsClubBand")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public MediaPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}
	
	@Bean("anotherPlayer")
	public MediaPlayer cdPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
