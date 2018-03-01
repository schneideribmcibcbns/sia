package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelLiteral {

	@Value("#{1}")
	private  int intLiteral;
	
	@Value("#{'Hello'}")
	private  String stringLiteral;
	
	@Value("#{false}")
	private  boolean boolLiteral;
	
	@Value("#{3.1416}")
	private  double doubleLiteral;
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("intLiteral = ")
		  .append(String.valueOf(intLiteral))
		  .append("\t")
		  .append("stringLiteral = ")
		  .append(stringLiteral)
		  .append("\t")
		  .append("boolLiteral = ")
		  .append(String.valueOf(boolLiteral))
		  .append("\t")
		  .append("doubleLiteral = ")
		  .append(String.valueOf(doubleLiteral));
		return sb.toString();
		  
	}

}
