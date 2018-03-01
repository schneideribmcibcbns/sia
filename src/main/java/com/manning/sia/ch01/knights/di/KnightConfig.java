package com.manning.sia.ch01.knights.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.manning.sia.ch01.knights.aop.Minstrel;

@Configuration
@ComponentScan(basePackages={"com.manning.sia.ch01.knights.di"})
@EnableAspectJAutoProxy
public class KnightConfig {

	@Bean
	//@Primary
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
	
	@Bean
	public Quest rescuringQuest() {
		return new RescureDamselQuest();
	}
	
	@Bean
	public Minstrel minstrel() {
		return new Minstrel();
	}
}
