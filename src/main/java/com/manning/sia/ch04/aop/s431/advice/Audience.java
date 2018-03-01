package com.manning.sia.ch04.aop.s431.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

	@Before("execution(* com.manning.sia.ch04.aop.s431.advice.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	
	@Before("execution(* com.manning.sia.ch04.aop.s431.advice.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("Taking seats");
	}

	@AfterReturning("execution(* com.manning.sia.ch04.aop.s431.advice.Performance.perform(..))")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}

	@AfterThrowing("execution(* com.manning.sia.ch04.aop.s431.advice.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("Demanding refund");
	}

}
