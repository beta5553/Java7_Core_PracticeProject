package com.qb.israel.inheritance;

public class Tester {
	
	public static void main(String [] args){
		new Tester();
	}
	
	public Tester()
	{
		Phone landLine = new Phone();
		SmartPhone smartPhone = new SmartPhone();
		System.out.println("about to test a landline phone as a phone");
		testPhone(landLine);
		System.out.println("about to test a smartPhone phone as a phone");
		testPhone(smartPhone);
		System.out.println("about to test a smartPhone phone as a smartPhone");
		testSmartPhone(smartPhone);

		System.out.println("Another test");
		Phone testPhone = new SmartPhone();
		testPhone.isRinging();
	}
	
	private void testPhone(Phone phone){
		phone.callNumber(1234567890);
		phone.isRinging();
	}
	
	private void testSmartPhone(SmartPhone phone){
		phone.sendEmail();
		phone.retrieveEmail();
		phone.isRinging();
	}

}
