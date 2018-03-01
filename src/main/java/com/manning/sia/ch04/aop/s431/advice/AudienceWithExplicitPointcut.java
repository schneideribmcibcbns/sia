package com.manning.sia.ch04.aop.s431.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceWithExplicitPointcut {

	@Pointcut("execution(* com.manning.sia.ch04.aop.s431.advice.Performance.perform(..))")
	public void performance() {
		
	}
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}

	@AfterReturning("performance()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}

	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demanding refund");
	}

	@Before("performance()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
}
