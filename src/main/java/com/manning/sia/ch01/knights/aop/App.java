package com.manning.sia.ch01.knights.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
	}

}
