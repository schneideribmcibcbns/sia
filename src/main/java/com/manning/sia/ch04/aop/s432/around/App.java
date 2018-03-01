package com.manning.sia.ch04.aop.s432.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String...strings) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Performance perf = context.getBean(Performance.class);
		perf.perform();
	}
}
