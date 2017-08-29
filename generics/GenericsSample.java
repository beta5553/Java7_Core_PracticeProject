package com.qb.israel.generics;

// this class will demonstrate the use of basic generic types.
// <T> = adding type safety to the class definition, this way we are telling the compiler this class 
// must use a specific type. the "T" is a place holder for any type. 

// <T>, <X>, <W>, <TYPE> its the same, it is just a name.  

public class GenericsSample <TYPE> {
	
	//using types and tape safety, one of the main advantages is to type safe, that means that error types
	//can be detected at compile time giving the developer an error by telling the type in use is not compatible
	//with the object in question.
	
	
	// Defining a T (type) Value variable, this means it will be the same type than the class is receiving.  
	private TYPE value;
	
	//Type safety constructor. 
	public GenericsSample (TYPE value){
		this.value = value;
	}
	
	//Generic method, it will return the same type object with the class was created. 
	public TYPE getValue(){
		return value;
	}
	
	// A raw type is nothing but a definition of a class that has not type and can cause errors, 
	// raw type example: List list = new ArrayList(); // Warning raw type. 
	// Generic type example: List<String> list = new ArrayList<String>(); // type safety. 
	
	// Diamond syntax, GenericSample<Float> g1 = new GenericSample<>(10F); 
	// There is no need to define the T after the new statement. 
	
	public static void main (String [] args) {
		GenericsSample<String> generic = new GenericsSample<String>("Hola Generics");
		System.out.println(generic.toString());
		System.out.println(generic.getValue());
		GenericsSample<Integer> generic1 = new GenericsSample<Integer>(10);
		System.out.println(generic1.toString());
		System.out.println(generic1.getValue());
		
		// Diamond syntax. 
		GenericsSample<Float> genericDiamond = new GenericsSample<>(10F);
		System.out.println(genericDiamond.getValue());
	}
}
