package com.manning.sia.ch03.s3.ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("crunchy")
public class Cookies implements Desert {
	@Override
	public String whatForDesert() {
		return "cookies";
	}
}
