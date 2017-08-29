package com.qb.israel.codefights;

public class Triangles {
	
	public static void main (String [] args) {
		Triangles t = new Triangles();
		t.numberOfTriangles(new int [] {2,5,7,9});
	}
	
	int numberOfTriangles(int[] sticks) 
	{
		  int res = 0;
		  
		  System.out.println("stick length: " + sticks.length);
		  for (int i = 0; i <= sticks.length; i++) {
			  
		    int k = i + 2;
		    System.out.println("k: " + k);
		    for (int j = i + 1; j < sticks.length; j++) 
		    {
		      while (k < sticks.length && sticks[j] < sticks[i] + sticks[j]) {
		    	System.out.println("k: "+k+" j: "+j+" i:"+i);  
		        k++;
		      }
		      res += k - j - 1;
		    }
		  }
		  return res;
		}

}
