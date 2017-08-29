package com.qb.israel.design_patterns.observable;

public class Point {
	
	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "point x " + x + " point y " + y;
	}
}
