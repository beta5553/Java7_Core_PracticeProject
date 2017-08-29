package com.qb.israel.design_patterns.dao;

public class XMLDAO implements PersonDAO {
	
	// this class implements the PersonDAO abstract methods, but it will read
	// and write and XML file instead of a DBMS, this is the magic of the 
	// DAO Data Access Object design pattern. 
	
	@Override 
	public void insertPerson(Person person) {
		System.out.println("XMLDAO Inserting a person on XML" + person.getName());
	}
	
	@Override
	public boolean deletePerson(Person person) {
		System.out.println("XMLDAO Deleting a person on XML" + person.getName());
		return true; 
	}
}