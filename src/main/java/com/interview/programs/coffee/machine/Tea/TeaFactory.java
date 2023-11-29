package com.interview.programs.coffee.machine.Tea;

public class TeaFactory {

	
	public TeaIntrfc getInstance(String str){
		TeaIntrfc tea;
		if(str.equals("MilkTea"))
			return new MilkTea();
		else 
			return new GreenTea();
		
	}
}
