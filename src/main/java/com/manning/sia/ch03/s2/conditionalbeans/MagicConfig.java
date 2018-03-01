package com.manning.sia.ch03.s2.conditionalbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MagicConfig {

	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean magicBean() {
		return new MagicBean();
	}
}
