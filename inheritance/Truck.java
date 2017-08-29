package com.qb.israel.inheritance;

public class Truck extends Automovile 
{	
	public void drive () { System.out.println("truck: drive");}
	
	public static void main(String [] args) 
	{
		Automovile a = new Automovile();
		
		Truck t = new Truck();
		a.drive();
		t.drive();
		
		a= (Automovile) t;
		a.drive();
		a.drive();
		t.drive();
		
		t.driveA();
		
		int w;
		
	}
	
}
