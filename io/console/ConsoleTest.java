package com.qb.israel.io.console;

import java.io.Console;

public class ConsoleTest {
	
	public static void main(String [] args) 
	{
		Console console = System.console();
		if(console==null) {
			System.out.println("cannot launch the console");
		}
		console.printf(console.readLine());
	}
}
