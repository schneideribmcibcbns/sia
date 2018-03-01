package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String...args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		SpelLiteral spelLiteral = context.getBean(SpelLiteral.class);
		SpelArithmetic spelArithmetic = context.getBean(SpelArithmetic.class);
		SpelConditional spelConditional = context.getBean(SpelConditional.class);
		SpelTypeExpression spelTypeExpression = context.getBean(SpelTypeExpression.class);
		SpelRelational spelRelational = context.getBean(SpelRelational.class);
		SpelRegex spelRegex = context.getBean(SpelRegex.class);
		SpelCollections spelCollection = context.getBean(SpelCollections.class);
		//CarPark carPark = context.getBean(CarPark.class);
		
		System.out.println(spelLiteral.toString());
		System.out.println(spelArithmetic.toString());
		System.out.println(spelConditional.toString());
		System.out.println(spelTypeExpression.toString());
		System.out.println(spelRelational.toString());
		System.out.println(spelRegex.toString());
		//System.out.println(carPark.getCarsByDriver().get("Driver2").toString());
		System.out.println(spelCollection.toString());
	}
}
