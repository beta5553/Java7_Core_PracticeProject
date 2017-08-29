package com.qb.israel.design_patterns.factory;

public class Circle implements IShape {
	
	private int x, y, r;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		System.out.println("Circle constructor");
	}

	@Override
	public void draw() {
		System.out.println("Circle draw");
	}

	@Override
	public void fillColor() {
		System.out.println("Circle fillColor");
	}
}
