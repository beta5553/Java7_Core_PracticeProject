package com.qb.israel.design_patterns.observable;

import java.util.Observable; 

public class Circle extends Observable {
	
	private Point center;
	private int radius;
	
	public Circle(int x, int y, int r) {
		this.center = new Point(x,y);
		this.radius = r;
	}
	
	public void setCenter(Point center) {
		this.center = center;
		setChanged();
		notifyObservers();
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
		setChanged();
		notifyObservers();
	}
	
	public String toString() {
		return "center = " + center + " radius " + radius;
	}
}
