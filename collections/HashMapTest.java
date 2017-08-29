package com.qb.israel.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	// Spellcheker
	public static void main (String [] args)  {
		Map<String, String> misspletWords = new HashMap<>();
		
		misspletWords.put("calender", "calendar");
		misspletWords.put("tomatos", "tomatoes");
		misspletWords.put("existance", "existence");
		misspletWords.put("aquaintance", "acquaintance");
		
		String sentence = "Buy a calender for the year 2013";
		
		for (String word : sentence.split("\\W+")) {
			if (misspletWords.containsKey(word)) {
				System.out.println("the correct spelling for " + word + " is " + misspletWords.get(word));
			}
		}
		
		Set<String> keys = misspletWords.keySet();
		System.out.println("These are the keys: " + keys);
	}
}
