package com.qb.israel.codefights;

import java.util.Arrays;

public class CodeFightChars {
	
	public static void main (String [] args) 
	{
		int [] vals = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9, 10};
		int [] vals1 = {1, 2, 4, 2, 10, 3, 1, 4, 5, 4, 9, 8};
		int [] vals12 = {8};
		
		CodeFightChars cfc = new CodeFightChars();
		//System.out.println(cfc.digitSum(111));
		System.out.println(cfc.tasksTypes(vals,2));
		
		System.out.println(cfc.tasksTypes1(vals1,1));
		System.out.println(cfc.tasksTypes1(vals12,1));
	}
	
	public int digitSum(int n) 
	{	
		String str = String.valueOf(n);
		int sum = 0;
		for(int i=0; i < str.length();i++) {
		String charValue = Character.toString(str.charAt(i));
		sum+= Integer.valueOf(charValue);
		}
		
	 return sum; 	
	}
	
	int[] tasksTypes(int[] deadline, int day) {
		
	    System.out.println("day:" + day);
	    
	    int [] result = {0,0,0};
	    for (int i = 0; i <= deadline.length-1; i++) 
	    {  
	    	System.out.println("Deadlinne = " + deadline [i]);
	    	
	        if (deadline [i] <= day) {
	        	System.out.println("Today: " + deadline[i]);
	          result[0]++; 
	        }
	        else
	        if (deadline [i] >= day+1 && deadline[i] <= (day + 6) ){
	        	System.out.println("Upcomming: " + deadline[i]);
	               result[1]++;
	            }
	         else if (deadline [i] >= day + 6) 
	        	 {
	        	 System.out.println("Later: " + deadline[i]);
	        	 result[2]++;
	        	 }
	    }
	    System.out.println(Arrays.toString(result));
	    return result; 
	}

	int[] tasksTypes1(int[] deadline, int day) {
	    int [] result = {0,0,0};
	    
	    for (int i = 0; i <= deadline.length-1; i++) {   
	        if (deadline [i] <= day){
	          result[0]++; 
	          continue;
	        }
	        else if (deadline [i] >= (day+1) && deadline[i] <= (day + 6) ){
	               result[1]++;
	               continue;
	            }
	         else if (deadline [i] >= (day + 6)) { result[2]++; }
	    }
	    return result; 
	}
	


}
