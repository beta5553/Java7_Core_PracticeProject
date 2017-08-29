package com.qb.israel.codefights;

public class DigitSum 
{
	public static void main (String [] args) {
		System.out.println("Hola");
		DigitSum ds = new DigitSum();
		ds.digitSum(111); 
	}
	
	//Receives 
	public int digitSum(int x) 
	{
	   int sum=0;
	   for (char w : String.valueOf(x).toCharArray()) {
		   sum+= Character.getNumericValue(w);
		   System.out.println(sum);
	   }
	   return sum;
	}
}
