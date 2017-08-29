package com.qb.israel.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class BundedWildcards 
{
	/*
	 * Simple explanation of Bunded Wilcards. 
	 *  
	 * <? extends E> defines E as the upper bound: "This can be cast to E".
	 * <? super E> defines E as the lower bound: "E can be cast to this." 
	 */

	public static Double sum(List<? extends Number> numList) {
		Double result =0.0;
		for(Number num : numList) {
			result += num.doubleValue();
		}
		return result;
	}
	
	public static <T> Double sum1(List<? super T> numList) {
		Double result =0.0;
		for(Object num : numList) {
			result += (Double) num;
		}
		return result;
	}
	
	public static void main(String [] args) {
		List<Integer> intList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		
		for (int i = 0; i< 5; i++) {
		    intList.add(i);
		    doubleList.add((double) (i*i));
		}
		
		System.out.println("The intList is: " + intList);
		System.out.println("The sum of the elements in intList is: " + sum(intList));		
		System.out.println("The intList is: " + doubleList);
		System.out.println("The sum of the elements in intList is: " + sum(doubleList));
		System.out.println("The intList is: " + doubleList);
		System.out.println("The sum of the elements in intList is: " + sum1(doubleList));
		
	}
}
