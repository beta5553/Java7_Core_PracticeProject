package com.qb.israel.comparable;

import java.util.Comparator;

public class CGPAComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return (student2.cgpa.compareTo(student2.cgpa));
	}
}
