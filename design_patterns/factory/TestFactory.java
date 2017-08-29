package com.qb.israel.design_patterns.factory;

public class TestFactory {
	
	public static void main (String [] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShape("Circle");
		canvas.addNewShape("Rectangle");
		canvas.redraw();
	}

}
