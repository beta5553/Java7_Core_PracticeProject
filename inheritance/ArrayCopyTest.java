package com.qb.israel.inheritance;

public class ArrayCopyTest {
	
	public static void main (String [] args) 
	{
		int [] scores = {1,2,3,4,5,6};
		
		System.arraycopy(scores, 2, scores, 3, 3);
		
		for (int i : scores) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println(10 + ((4 / 4) * 6) + 1);
		
	}
	
}
