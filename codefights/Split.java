package com.qb.israel.codefights;

public class Split {
	
	public static void main (String [] args) {
	  Split s = new Split(); 
	  s.splitAddress("http://codefights.com/alojar");
	  s.splitAddress("http://codefights.com/yeuu");
	  s.splitAddress("http://codefights.com");
	}
	
	public String [] splitAddress(String address) {
		return address.split("://|((.com/)|(.com))");
	}
}
 