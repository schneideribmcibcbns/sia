package com.manning.sia.ch01.knights.di;

import org.springframework.stereotype.Component;

@Component
public class RescureDamselQuest implements Quest {

	@Override
	public void embark() {
		System.out.println("Embarking on a quest to rescue the damsel.");
	}

}
