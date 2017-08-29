package com.qb.israel.inheritance;

class SomeThrowable extends Throwable {}
class MyThrowable extends SomeThrowable {}
class MyThrowable1 extends SomeThrowable {}
class MyThrowable2 extends SomeThrowable {}

class MyThrowable3 extends SomeThrowable {
	public static void main(){
		
	}	
}

public class TestClass1{
   public static void main(String args[]) throws SomeThrowable{
      try{
    	  
    	  String [] w = new String[0];
    	  System.out.println(w[0]);
    	  System.out.println(w.length);
    	  
         m1();
      }catch(SomeThrowable e){
         throw e;
      }finally{
         System.out.println("Done");
      }
   }
   
   public static void m1() throws MyThrowable{
      throw new MyThrowable();
   }
   
}