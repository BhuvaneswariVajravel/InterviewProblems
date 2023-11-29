package com.interview.programs.core;
/**
 * 
 * @author Bhuvaneswari.V
 * Find prime numbers between 1 to 1000
 *
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			if(isPrime(i))
				System.out.print(i+" , ");
		}
	}
	static boolean isPrime(int n){
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;				
		}
		return true;
	}
}
