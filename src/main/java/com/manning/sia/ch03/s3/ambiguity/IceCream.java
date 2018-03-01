package com.manning.sia.ch03.s3.ambiguity;

import org.springframework.stereotype.Component;

@Component
public class IceCream implements Desert {
	@Override
	public String whatForDesert() {
		return "iceCream";
	}
}
