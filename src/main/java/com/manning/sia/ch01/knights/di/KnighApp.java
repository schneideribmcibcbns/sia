package com.manning.sia.ch01.knights.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnighApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean("knight", BraveKnight.class);
		knight.embarkOnQuest();

		Knight squiredKnight = context.getBean(SquiredKnight.class);
		squiredKnight.embarkOnQuest();

		((AnnotationConfigApplicationContext) context).close();
	}
}
