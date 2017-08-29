package com.qb.israel.equals_hashcode;

public class Circle {
	
	private int xPos, yPos, radius;
	
	public Circle(int xPos, int yPos, int radius) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}
	
	@Override 
	public boolean equals(Object arg) 
	{
		if(arg == null) return false;
		if(this == arg) return true;
		
		if(arg instanceof Circle) {
			Circle circle = (Circle) arg;
			if((this.xPos == circle.xPos) && (this.yPos == circle.yPos) && (this.radius == circle.radius)) {
				return true;
			}
		}
		return false;
	}

	@Override		
	public int hashCode() {
		//bit operations.
		return (7 * xPos) ^ (11 * yPos) ^ (53 * yPos);
	}
}
