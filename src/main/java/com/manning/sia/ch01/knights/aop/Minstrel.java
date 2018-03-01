package com.manning.sia.ch01.knights.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Minstrel {
	
	@Before("execution(* com.manning.sia.ch01.knights.aop.*.embarkOnQuest(..))")
	public void singBeforeQuest() {
		System.out.println("Fa la la, the knight is so brave!");
	}

	@After("execution(* com.manning.sia.ch01.knights.aop.*.embarkOnQuest(..))")
	public void singAfterQuest() { 
		System.out.println("Tee hee hee, the brave knight did embark on a quest!");
	}
}
