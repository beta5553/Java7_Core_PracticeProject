package com.qb.israel.design_patterns.dao;


public class TestDAOFactory {
	
	//This class will demonstrate the use of the DAO Factory design patter.
	
	public static void main (String [] args) {
		
		System.out.println("Stating TestDAOFactory");
		Person person = new Person("Israel Morales", 33, "4705 E L", "8722378506");
		System.out.println(person);
		PersonDAO xmlPersonDAO = DAOFactory.getPersonDAO("XML");
		xmlPersonDAO.insertPerson(person);
		xmlPersonDAO.deletePerson(person);
		PersonDAO rdbmsPersonDAO = DAOFactory.getPersonDAO("RDBMS");
		rdbmsPersonDAO.insertPerson(person);
		rdbmsPersonDAO.deletePerson(person);
		System.out.println("Terminating Factory DAO program");
	}
}
