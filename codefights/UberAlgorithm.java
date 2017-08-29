package com.qb.israel.codefights;

public class UberAlgorithm {
	
	public static void main(String [] args) 
	{
		UberAlgorithm ua = new UberAlgorithm();
		int [] road1 = {1,5,6,7};
		int [] road2 = {3,10};
		int crossTime = 2; 
		
		ua.crossroads(road1, road2, crossTime);
	}
	
	boolean crossroads(int[] road1, int[] road2, int crossTime) 
	{
		  int j = 0;
		  for (int i = 0; i < road1.length; i++) 
		  {
			System.out.println("Road1" + road1[i]);  
		    while (j < road2.length) 
		    {
		      System.out.println("Road2" + road2[j]);
		      if (road2[j] + crossTime > road1[i]) {
		    	  System.out.println("Road2[j]:"+road2[j]+" crossTime:"+crossTime+" >"+road1[i]);
		    	  System.out.println("Return true");
		        return false;
		      }
		      j++;
		    }
		    
		    if (j < road2.length && road1[i] + crossTime > road2[j]) {
			      return true;
			    }
		  }
	  return false;
	}

}
