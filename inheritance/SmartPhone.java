package com.qb.israel.inheritance;

public class SmartPhone extends Phone {
	
	public void sendEmail(){
		System.out.println("SmartPhone: sending email");
	}
	
	public String retrieveEmail() {
		System.out.println("SmartPhone: Retrieveing email");
		String messages = new String();
		return messages;
	}
	
	public boolean isRinging(){
		System.out.println("SmartPhone: is ringing");
		return false; 	
	}

}
