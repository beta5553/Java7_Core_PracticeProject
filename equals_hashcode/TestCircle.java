package com.qb.israel.equals_hashcode;

import java.util.HashSet;
import java.util.Set;

public class TestCircle {
	
	public static void main (String [] args) {
		Set<Circle> circleList = new HashSet<>();
		circleList.add(new Circle(20,10,5));
		System.out.println(circleList.contains(new Circle(20,10,5)));
	}
}
