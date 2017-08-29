package com.qb.israel.inheritance;

public class TypeHandler {
	
 TypeA var1 = new TypeA();
 TypeA var2 = new TypeB();
 TypeA var3 = new TypeC();
 
 TypeB var4 = new TypeB();
 TypeB var5 = new TypeC();
 
 TypeC var6 = new TypeC();
 
 public static void main (String [] args){
	 new TypeHandler();	 
 }
 
 
 protected TypeHandler(){
	 
	 System.out.println("Constructor non-public");
	 
	 byte byt = 1;
	 char cha = 'a';
	 
	 double dou = '\u1234';
	 
	 double a = 'a';
	 double b = byt;
	 
	 byte I = (byte)(short)(int) 50L;
	 long L = (long)(int)(short) I;
	 
	 byt = (byte) b;
	 
	 try {
		 String bew;
		 System.out.println("Something");
	 }
	 finally { }
	 
	 int i, j, k;
     i = j = k = 91;
     System.out.println(i);
	 
 }
 
}
