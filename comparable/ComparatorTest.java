package com.qb.israel.comparable;

/*
 * The difference between comparator and comparable interfaces are 
 * that basically comparable interface uses the method compareTo() method 
 * while comparator uses the compare() method. 
 */

import java.util.Arrays;
public class ComparatorTest {
	
	public static void main (String [] args) 
	{
		Student [] students = { new Student("1","israel",123D), 
				                new Student("2","K",1D),
				                new Student("2","K",3D),
				                new Student("2","K",6D),
				              };
		
		System.out.println("before sorting by CGPA");
		System.out.println("Studient-ID \t CGPA (for 4.0)");
		System.out.println(Arrays.toString(students));
		Arrays.sort(students, new CGPAComparator());
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
		
	}
}
