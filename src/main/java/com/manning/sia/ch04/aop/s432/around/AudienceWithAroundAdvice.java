package com.manning.sia.ch04.aop.s432.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceWithAroundAdvice {
	@Pointcut("execution(* com.manning.sia.ch04.aop.s432.around.Performance.perform(..))")
	public void performance() {}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		}
		catch (Throwable e) {
			System.out.println("Demanding refund");
		}
	}
}
