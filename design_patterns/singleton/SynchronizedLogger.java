package com.qb.israel.design_patterns.singleton;

public class SynchronizedLogger {
	
	//This class is synchronized to ensure this is a real singleton on a multi-threading 
	//environment, the synchronized keyword is a java concurrency mechanism to allow
	//only one thread at the time to access into the synchronized scope.
	
	// private constructor to avoid other classes to initiatiate this one. 
	private SynchronizedLogger() {}
	
	// null object. 
	private static SynchronizedLogger myInstance;
	
	// note use of synchronized, but this will create a very poor performance on the 
	// application by creating a bottleneck since the whole method is synchronized.
	// this works but is having bad performance. 
	public static synchronized SynchronizedLogger getInstance() 
	{
		if (myInstance==null) {
			myInstance = new SynchronizedLogger();
		}
		return myInstance;
	}

}
