package com.manning.sia.ch04.aop.s434.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

	@DeclareParents(value="com.manning.sia.ch04.aop.s434.introductions.Performance+", defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
