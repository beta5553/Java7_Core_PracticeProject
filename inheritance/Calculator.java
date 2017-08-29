package com.qb.israel.inheritance;

abstract class Calculator {
	
	abstract void calculate();
	
	public static void main (String [] args) 
	{
		System.out.println("calculating");
		System.out.println(5 * 4 + 4 / 2);
	}
	
	void myMethod(){ }
	
	String myMethod(int a){
		return "";
	}
	
	int myMethod(String b){
		return 1;
	}
	
}
