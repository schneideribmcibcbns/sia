package com.manning.sia.ch02.s1.autoconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String...args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MediaPlayer player = context.getBean(MediaPlayer.class);
		player.play();
		((AnnotationConfigApplicationContext) context).close();
	}
}
