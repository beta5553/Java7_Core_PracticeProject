package com.qb.israel.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceTest {
	
	public static void main (String [] args) {
		Queue<String> loginSequence = new LinkedList<>();
		loginSequence.add("Harrison");
		loginSequence.add("Starr");
		loginSequence.add("Lennon");
		System.out.println("The login sequence is: " + loginSequence);
		
		while(!loginSequence.isEmpty()){
			System.out.println("Removing" + loginSequence.remove());
		}
	}
}
