package com.qb.israel.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
	
	static void printList(List<?> list) {
		for(Object l:list) {
			System.out.println(l.toString());
		}
	}
	
	public static void main(String [] args) {
	   List<Integer> list = new ArrayList<>();
	   list.add(10);
	   list.add(100);
	   printList(list);
	   List<String> strList = new ArrayList<>();
	   strList.add("10");
	   strList.add("100");
	   printList(strList);
	}
	
}
