package com.manning.sia.ch03.s5.runtimevalueinjection.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ExpressiveConfig.class);
		System.out.println(context.containsBean("disc"));
		System.out.println(context.getBean(DiskFromValue.class).toString());
	}
}
