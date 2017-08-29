package com.qb.israel.design_patterns.abstract_factory;

public class DisplayFriendlyCircle implements DisplayFiendlyShape {
	
	private int x,y,r;
	
	public DisplayFriendlyCircle (int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		System.out.println("DisplayFiendlyCircle ");
	}

	@Override
	public void draw() {
		
	}

	@Override
	public void fillColor() {
		
	}
}
