package com.manning.sia.ch01.knights.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SquiredKnight implements Knight {
	private Quest quest;
	private Squire squire;

	@Autowired
	public SquiredKnight(Quest quest, @Qualifier("shorty") Squire squire) {
		this.quest = quest;
		this.squire = squire;
	}
	
	@Override
	public void embarkOnQuest() {
		quest.embark();
		squire.serve();
	}
}
