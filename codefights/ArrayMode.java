package com.qb.israel.codefights;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ArrayMode {

	public static void main(String[] args) {
		ArrayMode am = new ArrayMode();
		am.arrayMode(new int []{1,2,2,1,3,1,4,4,4,4,1,2,2,2,2,3,4,5,5,6});
	}
	
	public int arrayMode(int [] sequence)
	{
		Set<Integer> numbers = new HashSet<Integer>();
		Map<Integer,Integer> mapNumber = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < sequence.length; i++) {
			numbers.add(sequence[i]);
		}
		
		for (Integer x : numbers) {
			mapNumber.put(x, 0);
		}
		
		for(int i = 0; i < sequence.length; i++) {
			if (mapNumber.containsKey(sequence[i])) {
				mapNumber.put(sequence[i],mapNumber.get(sequence[i])+1);
			}
		}
		
		int max = Collections.max(mapNumber.values());
	    
	    for (Entry<Integer, Integer> entry : mapNumber.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==max) {
            	System.out.println(entry.getKey());
                return entry.getKey();     // Print the key with max value
            }
        }
	    
		return 0;
	}
	
	public int arrayModeImproved() 
	{	
		int [] numbers = new int []{1,2,2,1,3,1,4,4,4,4,1,2,2,2,2,3,4,5,5,6};
		
		
      return 0;
	}

}
