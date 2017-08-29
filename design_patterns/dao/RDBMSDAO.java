package com.qb.israel.design_patterns.dao;

public class RDBMSDAO implements PersonDAO {
	
	//This class implements the abstract methods from the PersonDAO interface. 

	@Override
	public void insertPerson(Person person) {
		System.out.println("RDBMSDAO Inserting new person." + person.getName());
	}

	@Override
	public boolean deletePerson(Person person) {
		System.out.println("RDBMSDAO Deleting person." + person.getName());
		return true;
	}
}
