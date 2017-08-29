package com.qb.israel.design_patterns.dao;

public class DAOFactory {
	
	public static PersonDAO getPersonDAO(String sourceType) {
		//this is an example of how to implement a DAO factory. 
		//in a real world application more types can be applied.
		// all the DAOs extends PersonDAO which allow the factory to work. 
		
		switch (sourceType) {
			case "RDBMS" : return new RDBMSDAO();
			case "XML" : return new XMLDAO();
			default: return null;
		}
	}
}