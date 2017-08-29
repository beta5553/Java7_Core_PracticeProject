package com.qb.israel.inheritance;

public class TestClass 
{
	
	 public void testRefs(String str, StringBuilder sb)
	 {
		    str = null;	 
		    str = str + sb.toString();
		    sb.append(str);
		    str = null;
		    sb = null;
		    System.out.println(str);
	}
	 
	 
	 public static void changeNumber(Number n) {
		 n = new Number();
		 n.setNumber(10);
	 }
	 
	 public static void changeInteger(Integer i) {
		 i = 5;
	 }
	 
	 public static void stringTest(String sr){
		 sr = null;
	 }
	 
	 public static void changeDouble(Double d) {
		 d = 6.7;
	 }
		  
	 	public static void main(String[] args)
	 	{
		    String s = "aaa";
		    StringBuilder sb = new StringBuilder("bbb");
		    
		    new TestClass().testRefs(s, sb);
		    
		    System.out.println("s="+s+" sb="+sb);
		    String hola = "Hola";
		    stringTest(hola);
		    System.out.println(hola);
		    
		    Number number = new Number();
		    number.setNumber(50);
		    
		    System.out.println(number.getNumber());
		    changeNumber(number);
		    System.out.println(number.getNumber());
		    
		    Integer integer = new Integer("50");
		    System.out.println(integer);
		    changeInteger(integer);
		    System.out.println(integer);
		    
		    Double d = 5.0; 
		    System.out.println(d);
		    changeDouble(d);
		    System.out.println(d);
		    
		    
		    String st = "Hola";
		    System.out.println(st);
		    st = "adios";
		    System.out.println(st);
		    
		    
		}
	 	
	 	
	 	
}
