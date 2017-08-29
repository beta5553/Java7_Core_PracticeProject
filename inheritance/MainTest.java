package com.qb.israel.inheritance;

import com.qb.israel.polycom.Arrays;

public class MainTest 
{	
	int x; 
	
	public static void main (String args []) {
		new MainTest().start(new MainTest().x);
	}
	
	void start(int w) {
	
		int [] data = {1,3,5,7,9,11};
		System.arraycopy(data, 2, data, 3, 2);
		
		for (int i : data) {
			System.out.print(i);
		}
	}

}
