package com.qb.israel.codefights;

public class ArrayElementsProduct {
	
	public static void main (String [] args) {
		ArrayElementsProduct a = new ArrayElementsProduct();
		System.out.println(a.arrayElementsProduct(new int []{2,4,10,1}));
	}
	
	int arrayElementsProduct(int[] inputArray) {

		  int result =  1 ;

		  for (int i = 0; i < inputArray.length; i++) {
			  System.out.println(inputArray[i]);
		    result *= inputArray[i];
		  }
		  return result;
		}


}
