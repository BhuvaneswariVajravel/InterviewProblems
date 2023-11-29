package com.interview.programs.core;

public class StaticLocale {
	private static int yesterday=1;
	int tommorow =10;

	public static void main(String[] args) {
		
		StaticLocale check =  new StaticLocale();
		int today =20, tommorow =40;
		System.out.println("======"+(today+check.tommorow+check.yesterday));
	}
}
