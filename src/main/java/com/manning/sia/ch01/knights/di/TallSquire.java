package com.manning.sia.ch01.knights.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TallSquire implements Squire {

	@Override
	public void serve() {
		System.out.println("I'm tall");

	}

}
