package com.qb.israel.design_patterns.singleton;

public class Logger {
	
	// Singleton example.
	
	//Declare private constructor to avoid other classes to instantiate this class.
	//This will avoid any other class to create a new instance of this class, so 
	// the only way to get is is throughout getInstance();
	private Logger() {}
	
	//By default this object is initialized as null. 
	private static Logger myInstance;
	
	public static Logger getInstance() {
		if (myInstance==null) {
			myInstance = new Logger();
		}
		return myInstance;
    }
	
	public void log(String log) {
		//Logger implementation right here...
		System.out.println("Error occurred while doing something ");
	}
}
