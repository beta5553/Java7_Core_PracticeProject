package com.qb.israel.design_patterns.factory;

public class Rectangle implements IShape {
	
	private int lenght;
	private int height; 
	
	public Rectangle (int lenght, int height) {
		this.lenght = lenght;
		this.height = height;
		System.out.println("Rectangle constructor");
	}

	@Override
	public void draw() {
		System.out.println("Rectangle draw");
	}

	@Override
	public void fillColor() {
		System.out.println("Rectangle fillColor");
	}
}
