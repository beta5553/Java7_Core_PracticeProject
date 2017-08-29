package com.qb.israel.design_patterns.dao;

import java.io.Serializable;

/* this class implements Serializable in case to use the transfer object 
 * between two JVMs, then the transfer object has to be Serializable  
 * */ 

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	
	public Person(String name, int age, String address, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
