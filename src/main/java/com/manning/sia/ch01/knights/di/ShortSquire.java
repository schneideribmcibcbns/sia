package com.manning.sia.ch01.knights.di;

import org.springframework.stereotype.Component;

@Component("shorty")
public class ShortSquire implements Squire {

	@Override
	public void serve() {
		System.out.println("I'm short");

	}

}
