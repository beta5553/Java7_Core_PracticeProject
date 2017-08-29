package com.qb.israel.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
	
	public static void main (String [] args) 
	{
		NavigableMap<Integer, String> examScores = new TreeMap<>();
		examScores.put(90, "Sophia");
		examScores.put(20, "Stefania");
		examScores.put(10, "Karime");
		examScores.put(50, "Belen");
		examScores.put(80, "Claudia");
		examScores.put(100, "Tania");
		System.out.println("the data in the map is : " + examScores);
		System.out.println("the data in decending order is: " + examScores.descendingMap());
		System.out.println("Details of those who passed the exam: " + examScores.tailMap(50));
		System.out.println("the lowest record is " + examScores.firstEntry());
	}
}
