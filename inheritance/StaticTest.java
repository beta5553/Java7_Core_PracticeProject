package com.qb.israel.inheritance;

public class StaticTest {
	
	
	static String str; 
	
	 void m1(){
	        StaticTest.m2();  // 1
	        m4();             // 2
	      //  StaticTest.m3();  // 3
	        str="";
	    }
	    
	    static void m2(){ }  // 4
	    
	    void m3(){
	        m1();            // 5
	        m2();            // 6
	     //   StaticTest.m1(); // 7
	    }
	    
	    static void m4(){ }
	    
	    public static void main (String [] args) {
	    	
	    	StaticTest t = new StaticTest();
	    	t.tryStaticFromNonStatic();
	    	
	    	char [] c = new char[10];
	    	System.out.print(c[5]);
	    	System.out.print(c[5]);
	    	System.out.print(c[5]);
	    	System.out.print(c[5]);
	    	System.out.print(c[5]);
	    } 
	    
	    void tryStaticFromNonStatic(){
	    	m4();
	    }

}
