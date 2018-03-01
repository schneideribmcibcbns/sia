package com.manning.sia.ch04.aop.s433.parameters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CompactDisk sgtPeppers = context.getBean(CompactDisk.class);
		TrackCounter counter = context.getBean("trackCounter", TrackCounter.class);
		sgtPeppers.play();
		sgtPeppers.playTrack(1);
		sgtPeppers.playTrack(2);
		sgtPeppers.playTrack(3);
		sgtPeppers.playTrack(3);
		sgtPeppers.playTrack(3);
		sgtPeppers.playTrack(3);
		sgtPeppers.playTrack(7);
		sgtPeppers.playTrack(7);
		System.out.println(counter.toString());
	}

}
