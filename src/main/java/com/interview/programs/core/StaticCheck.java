package com.interview.programs.core;

public class StaticCheck {
	private static int i = 0;

	public static void main(String[] args) {

		StaticCheck check1 = new StaticCheck();
		check1.i = 1;
		StaticCheck check2 = new StaticCheck();
		check2.i = 2;
		System.out.println("====check1.i===="+check1.i);
		System.out.println("====check2.i===="+check2.i);
		System.out.println("====StaticCheck.i===="+StaticCheck.i);

		check1.i=check1.i+check2.i+StaticCheck.i;
		System.out.println("====i===="+check2.i);
		
	}
}
