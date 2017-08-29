package com.qb.israel.generics.methods;

import java.util.List;

public class GenericMethodClass {
	
	// Static Generic Method. 
	public static <T> void getString(List<T> list, String args) { }
	
	
	// Public Generic Method 
	public <T> String getString() { return ""; }
	
	
}
