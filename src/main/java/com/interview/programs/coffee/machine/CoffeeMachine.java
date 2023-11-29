package com.interview.programs.coffee.machine;

import java.util.Scanner;

import com.interview.programs.coffee.machine.Tea.TeaFactory;
import com.interview.programs.coffee.machine.Tea.TeaIntrfc;
import com.interview.programs.coffee.machine.coffee.CoffeeFactory;
import com.interview.programs.coffee.machine.coffee.CoffeeIntrfc;

public class CoffeeMachine {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String type = sc.nextLine();
		String sType = sc.nextLine();
		if(type.equals("Tea")) {
			TeaIntrfc TeaIntrfc =new TeaFactory().getInstance(sType);
			String tea = TeaIntrfc.prepareTea();			
			System.out.println(tea);
			
		}else if(type.equals("Coffee")) {
			CoffeeIntrfc coffeeIntrfc =new CoffeeFactory().getInstance(sType);
			String coffee = coffeeIntrfc.prepareCoffee();
			
			System.out.println(coffee);
		}
	

	}
}
