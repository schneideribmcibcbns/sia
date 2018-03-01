package com.manning.sia.ch03.s3.ambiguity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cake implements Desert {

	@Override
	public String whatForDesert() {
		return "cake";
	}
}
