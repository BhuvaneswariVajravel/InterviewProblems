package com.interview.programs.coffee.machine.coffee;

public class CoffeeFactory {

	
	public CoffeeIntrfc getInstance(String str){
		CoffeeIntrfc coffee;
		if(str.equals("Expresso"))
			return new ExpressooTea();
		else 
			return new Lacto();
		
	}
}
