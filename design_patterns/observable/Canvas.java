package com.qb.israel.design_patterns.observable;

import java.util.Observable;
import java.util.Observer;

public class Canvas implements Observer {
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Canvas::update");
	}
	
}
