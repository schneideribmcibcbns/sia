package com.manning.sia.ch03.s3.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Diner diner = context.getBean(Diner.class);
		System.out.println(diner.showMe());
	}
}
