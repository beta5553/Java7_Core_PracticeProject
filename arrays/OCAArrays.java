package com.qb.israel.arrays;


public class OCAArrays {
	
	public static void main (String [] args) throws Exception {
		
		int x = 1;
		char [] c1 = new char[3];
		
		System.out.println("Char : "+ (int)c1[0]);
		
		int [][][] myInt  = new int [x][x=2][c1[0]];

		
		System.out.println(myInt.length);
		System.out.println(myInt[0].length);
		System.out.println(myInt[0][0].length);
		
		char ch = 'a';
		short s = (short)ch;
		ch = (char)s;
		byte b = (byte)ch;
		int i = ch;
		
		for (int w=0; w<10 ; ++w) {
			System.out.println(w);
		}
		
		String s1 = "";
		s1 +=  150;		
		System.out.println("Int to string:" + s1);
		
		
		double d1 = 0b10_1_1111111100010101010101111101;
		double d2 = 0xa10___11_11;
		
		
		boolean b1 = false;
		boolean b2 = false; 
		
		if (b2 = b1 == false){
			System.out.println(true);
		}
		else
			System.out.println(false);
		
		try {
			test();
		}
		catch (Exception e){
			
		}
		finally {
			System.out.println("finally...");
		}
	}
	
	static int getVal(){
		return 5;
	}
	
	static int getValue(int a, long b){
		return 1;
	}
	
	static int getValue(long a, int b) {
		return 1;
	}
	
	
	static void test(){
		test1();
	}
	
	static void test1(){
		throw new RuntimeException("bb");
	}
}
