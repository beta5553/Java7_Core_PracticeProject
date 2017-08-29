package com.qb.israel.design_patterns.singleton;

public class DoubleCheckedLockingLogger {
	
	// private constructor. 
	private DoubleCheckedLockingLogger() {}
	
	// null object.
	private static DoubleCheckedLockingLogger myInstance;
	
	// this method implements the double checked locking, however is not a good 
	// implementation either, so avoid it. 
	public static DoubleCheckedLockingLogger getInstance() {
		if (myInstance == null) {
			synchronized(DoubleCheckedLockingLogger.class) {
				if(myInstance==null) {
					myInstance = new DoubleCheckedLockingLogger();
				}
			}
			
			myInstance = new DoubleCheckedLockingLogger();
		}
		return myInstance;
	}
	
	public void log() {
		System.out.println("log some errors...");
	}
}
