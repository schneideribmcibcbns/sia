package com.manning.sia.knights.di;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.manning.sia.ch01.knights.di.BraveKnight;
import com.manning.sia.ch01.knights.di.Quest;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnquest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
