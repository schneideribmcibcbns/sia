package com.manning.sia.ch03.s3.ambiguity;

import org.springframework.stereotype.Component;

@Component
@Smoothy
public class Beer implements Drink {
	@Override
	public String whatForDrink() {
		return "beer";
	}
}
