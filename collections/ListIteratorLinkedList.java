package com.qb.israel.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorLinkedList {
	
	public static void main (String [] args) 
	{
		String palindromeStr = "abcba";
		List<Character> palindrome = new LinkedList<>();
		
		for (char ch : palindromeStr.toCharArray()){
			palindrome.add(ch);
		}
		
		System.out.println("Input string is:" + palindromeStr);
		
		ListIterator<Character> iterator = palindrome.listIterator();
		ListIterator<Character> revIterator = palindrome.listIterator(palindrome.size());
		
		boolean result = true;	
		while (revIterator.hasPrevious() && iterator.hasNext()) {
			if (iterator.next() != revIterator.previous()) {
				result = false;
				break; 
			}
		}
		
		
		
		if (result) 
			System.err.println("input string is a palindrome");
		else 
			System.err.println("input string is NOT a palindrome");
	}
}

