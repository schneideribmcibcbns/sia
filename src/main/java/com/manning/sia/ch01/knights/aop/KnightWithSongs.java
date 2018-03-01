package com.manning.sia.ch01.knights.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KnightWithSongs implements Knight {

	private Quest quest;
	
	@Autowired
	public KnightWithSongs(Quest quest) {
		this.quest = quest;
	}
	
	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

}
