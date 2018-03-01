package com.manning.sia.ch01.knights.di;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;

public class SlayDragonQuest implements Quest {
	private PrintStream stream;
	
	@Autowired
	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void embark() {

		stream.println("Embarking on quest to slay the dragon!");
	}

}
