package com.qb.israel.codefights;

public class Factorial {
	
	public static void main (String [] args) {
		Factorial f = new Factorial();
		f.factorial(5); 
	}
	
	public int factorial(int f) {
		System.out.println("asdad");
		
		int fact = 1;
		for (int i=1; i <= f; i++) {
			fact*=i;
			System.out.println("fact: "+fact);
			System.out.println("i"+i);
			System.out.println(fact+"*");
		}
		
		return 1;
	}
}
