package com.manning.sia.ch03.s3.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Diner {

	private Desert desert;
	private Drink drink;

/*	
 * This would not work with more than one bean of type of Desert.
 * The solution is to define a primary one. See Cake
 * 
	@Autowired
	public void setDesert(Desert desert) {
		this.desert = desert;
	}
	
*/	
/* Or use qualifier. The default qualifier of a bean is its ID. 
 * And the default ID is the bean's class name. See IceCream
	@Autowired
	public void setDesert(@Qualifier("iceCream") Desert desert) {
		this.desert = desert;
	}
*/	
	
/*
 * We can also assign a qualifier to a bean and refer to it at the injection point.
 * See Cookies.
 */
	@Autowired
	@Qualifier("crunchy")
	public void setDesert(Desert desert) {
		this.desert = desert;
	}
	
	@Autowired
	@Smoothy
	@Grapy
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	public String showMe() {
		StringBuffer sb = new StringBuffer();
		sb.append(desert.whatForDesert())
		  .append("\n")
		  .append(drink.whatForDrink());
		
		return sb.toString();
	}
}
