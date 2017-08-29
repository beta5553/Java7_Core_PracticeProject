package com.qb.israel.inheritance;


//checked exceptions inherits Exception
//uncheked exceptions inherits RuntimeException

public class MyException extends Exception {
	
	//By Convention every exception should have 2 constructors. 
	//One with no paramaters and one with a String parameter.
	
	public MyException () {
		super();
	}
	
	public MyException (String exception) {
		super("MyException "+exception);
	}

}
