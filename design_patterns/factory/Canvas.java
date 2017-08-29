package com.qb.israel.design_patterns.factory;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {
	
	private ArrayList<IShape> shapeList = new ArrayList<IShape>();
	
	public void addNewShape(String shapeType) {
		IShape shape = ShapeFactory.getShape(shapeType);
		shapeList.add(shape);
	}
	
	public void redraw() {
		Iterator<IShape> itr = shapeList.iterator();
		while (itr.hasNext()) {
			IShape shape = itr.next();
			shape.draw();
		}
	}
}
