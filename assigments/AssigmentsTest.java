package com.qb.israel.assigments;

import java.util.ArrayList;
import java.util.Collections;

public class AssigmentsTest 
{
	private enum Enum1 { A, B, C }

	public static void main(String[] args) {
		new AssigmentsTest().test();
	}
	
	public void test() {
		System.out.println("Hola");
		int a = 0;
		int b = -20;
		
		int y = 2; 
		System.out.println("y=" + (y^5));
		
		int c = (10 - --b + ++a);
		
		System.out.println("b"+b);
		System.out.println("a"+a);
		System.out.println("c"+c);
		
		operation("sum");
		stringTests();
	}
	
	public void operation(String operation) 
	{
		int a = 1;
		Boolean b1;
		boolean b = (b1 = true);
		System.out.println(b);
		
		switch (Enum1.A) {
			case B: System.out.println("1"); break;
			case C: System.out.println("2"); break;
//			case 3: System.out.println("3"); break;
//			case 4: System.out.println("4"); break;
			default: System.out.println("default"); break;
		}
		
		
		String s1 = "S2";
		
		switch (s1) {
		   case "S1": System.out.println("s1 ok"); break;
		   case "S2": System.out.println("s2 ok"); break;
		   case "S3": System.out.println("s3 ok"); break;
		}
		
		loops();
	}
	
	//some loops
	public void loops() 
	{
		System.out.println("loops");
		
		int x = 0;
		
		//do while. 
		do {
		  ++x;
		  System.out.println(x);
 		} while (x<10);
		
		
		while (x==1){
			System.out.println("while: " + x);
			x--;
		}
		
		//for
		int w;
		for (w=0, x=1 ; w < 10 ; w++, x--, w=w-x) {
			System.out.println("w"+w);
			System.out.println("x"+x);
		}
		
		ArrayList<String> fishList = new ArrayList<>();
		fishList.add("fish1");
		fishList.add("fish2");
		fishList.add("fish3");
		
		//enhanced for. 
		for (String fish : fishList) {
			System.out.println("fish: " + fish);
		}
		
		int sizes [] = {1,2,3,4,5,6,7,8};
		int [] sizess = {1,2,34};
		int [] a = new int [] {1,2,3,4};
		
		int [][] ab = new int [][] {{1,2},{1,2}};
		int [][][] abc = new int [][][] {{{1,2,1,2,3,4}},{{3,4,6,7,8,9}},{{5,6,6,7,7,7,7}}};
		
		System.out.println("abc[0][1][1]" + abc[0][0][0]);
		
		if (palindrome("salas")) System.out.println("yes");
		arrayLists();
		nextPrime(7);
		segmentsIntersection(new int [] {1,2}, new int [] {4,6});
		isSkewSymmetricMatrix(new int [][] {{0,0,1},{0,0,-2},{-1,-2,0}});
	}
	
	
	public boolean palindrome (String palindrome) 
	{
		palindrome = palindrome.toLowerCase();
		char [] chars = palindrome.toCharArray();
		char [] chars1 = new char [chars.length];

		for (int x=chars.length-1, w=0; x>=0; x--, w++) {
			chars1[w] = chars[x]; 
		}
		
//		System.out.println("chars"+ String.valueOf(chars));
//		System.out.println("chars1"+ String.valueOf(chars1));
		if (String.valueOf(chars).equals(String.valueOf(chars1))) return true; else return false;
		//if (chars.equals(chars1)) return true; else return false;s
	}
	
	
	public void arrayLists ()
	{
		ArrayList<Float> list = new ArrayList<Float>();
		list.add(10.0f);
   	    list.add(15.5f);
   	    list.add(18.0f);
   	    list.add(29.5f);
   	    list.add(45.5f);
   	    
   	    label1:
   	    for (Float value : list) {	
	    	if (value > 28) { 
	    		System.out.println("value: " + value);
	    		break label1;
	    	}
	    }
	    
//   	    label1:
//	    while (true) {
//	    	continue label1; 
//	    }
	    
   	    	
	}
	
	int nextPrime(int n)
	{
		System.out.println("next prime for " + n);
		  for (int i = n + 1; ; i++) 
		  {
			  System.out.println("i"+i);
		    boolean isPrime = true;
		    for (int divisor = 2; divisor * divisor <= i; divisor++) 
		    {
		    	System.out.println("divisor"+divisor);
		      
		      if (i % divisor == 0) 
		      {
		    	System.out.println("Is not prime");
		        isPrime = false;
		        break;
		      }
		    	
		    }
		    if (isPrime) {
		    	System.out.println("primo: " + n);
		      return n;
		    }
		  }
		}

	
	int segmentsIntersection(int[] left, int[] right) 
	{
		System.out.println("Segments intersections");

		  class Pair implements Comparable<Pair> {
		    int first;
		    int second;

		    Pair(int first, int second) {
		      this.first = first;
		      this.second = second;
		    }

		    @Override
		    public int compareTo(Pair p) {
		      return first != p.first ? Integer.compare(first, p.first) :
		          Integer.compare(second, p.second);
		    }
		  }

		  int answer = 0;
		  int opened = 0;
		  ArrayList<Pair> events = new ArrayList<>();

		  for (int i = 0; i < left.length; i++) {
		    events.add(new Pair(left[i], 1));
		    events.add(new Pair(right[i],1));
		  }

		  Collections.sort(events);

		  for (int i = 0; i < events.size(); i++) {
		    if (opened == left.length) {
		      answer += events.get(i).first - events.get(i - 1).first;
		    }
		    opened += events.get(i).second;
		  }
		  
		  System.out.println("answer: " + answer);
		  return answer;
		}
	
	
	
	//isSkewSymmetricMatrix(new int [][] {{0,0,1},{0,0,-2},{-1,-2,0}});
	boolean isSkewSymmetricMatrix(int[][] matrix) 
	{
	  System.out.println("isSkewSymmetricMatrix");
	  
	  int [][] matrix1;
	  
	  for(int j=0; j < matrix.length; j++)
		  for (int x = 0; x < matrix.length; x++) {
			  System.out.println(matrix[j][x]);
		  }
	  
      return true;
	}
	
	
	public void stringTests()
	{
		System.out.println("String tests");
	    String str = "Hola mundo";
	    str.replace("mundo", "enfermera");
	    System.out.println(str);
		
	}

}

