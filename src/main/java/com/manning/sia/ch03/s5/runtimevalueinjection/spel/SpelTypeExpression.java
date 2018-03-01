package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelTypeExpression {

	@Value("#{T(System).currentTimeMillis()}")
	private long timeInMs;
	
	@Value("#{2 * T(Math).PI}")
	private double twoPI;
	
	@Override
	public String toString() {
		return "timeInMs = " + timeInMs + " twoPI = " + twoPI;
	}
}
