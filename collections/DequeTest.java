package com.qb.israel.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
	
	private Deque<String> sqlQ = new ArrayDeque<>();
	
	void addInqueue(String customer){
		sqlQ.addLast(customer);
	}
	
}
