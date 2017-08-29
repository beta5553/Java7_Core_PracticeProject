package com.qb.israel.comparable;

public class Student implements Comparable<Student> {
	
	private String id;
	private String name;
	Double cgpa;
	
	public Student(String id, String name, Double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	@Override
	public int compareTo(Student arg0) {
		return this.id.compareTo(arg0.id);
	}

}
