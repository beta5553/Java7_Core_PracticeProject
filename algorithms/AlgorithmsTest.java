package com.qb.israel.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 * This class demonstrates the usage of the Collections class which implements  \
 * Collections & Arrays
 * 
 * @author Israel.Morales
 *
 */
public class AlgorithmsTest {
	
	public static void main (String [] args) {
		AlgorithmsTest test = new AlgorithmsTest();
		test.collectionsAlgorithms();
		test.arraysAlgorithms();
	}
	
	public void arraysAlgorithms() {
		int [] intArray = {1,2,3,4,5};
		int y [] = {1,2};
		
		System.out.println(intArray);
		System.out.println(Arrays.toString(intArray));
		
		/**
		 *  Here is a good example of pollymorphism
		 *  
		 */ 
		
		List<Double> dList = new LinkedList<>();
		System.out.println(dList.getClass());
	}
	
	public void collectionsAlgorithms()
	{
		List<String> playList = new LinkedList<>();
		//List<String> playList = new ArrayList<>();
		playList.add("Mana");
		playList.add("Moenia");
		playList.add("Cafe tacuba");
		playList.add("Maroon 5");
		playList.add("Metallica");
		
		System.out.println("The original playlist is: " + playList);
		Collections.reverse(playList);
		System.out.println("The reversed playlist is: " + playList);
		Collections.shuffle(playList);
		System.out.println("The shuffling playlist is: " + playList);
		Collections.sort(playList);
		System.out.println("The sorted palylist by name is: " + playList);
		
		String mana = "Mana";
		int index = Collections.binarySearch(playList, mana);
		
		if (index >= 0)
			System.out.printf("Yes, its the %d song", (index + 1));
		else
			System.out.printf("No, the song was not found");
		
		System.out.println("Let me forward by two songs: (rotate the songs) ");
		Collections.rotate(playList, 2);
		System.out.println(playList);
	}
}
