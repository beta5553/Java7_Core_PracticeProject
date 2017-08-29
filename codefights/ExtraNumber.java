package com.qb.israel.codefights;

public class ExtraNumber {
	
	public static void main (String [] args) {
	 ExtraNumber e = new ExtraNumber();	
	 System.out.println(e.extraNumber(1,2,1));
	}
	
	public int extraNumber(int a, int b, int c) {
		if(a==b) return c; 
		if(b==c) return a;
		if(c==a) return b;
		return 1;
	}
}

