package com.qb.israel.design_patterns.observable;

/** This class will explain how to implement the design pattern: OBSERVABLE
 *  which is used to notify other objects about a change in the status of a 
 *  object, using low coupling which promotes the code reuse, since allow to 
 *  be implemented for more than one object. 
 * */

public class ObservableMainClass 
{	
	public static void main (String [] args) 
	{
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.addObserver(new Canvas());
		circle.addObserver(new ShapeArchiver());
		circle.setRadius(50);
		System.out.println(circle.toString());
	}
}
