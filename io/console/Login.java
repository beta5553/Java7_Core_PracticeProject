package com.qb.israel.io.console;

public class Login {
	
	public static void main (String [] args) {
		Console console = new Console();
		
		if (console != null)
		{
			String userName = null;
			String pwd = null;
			userName = console.readLine("Enter your user name: ");
			System.out.println("Your user name is: " + userName);
			pwd = console.readPassword("Enter your password: ");
			System.out.println("Your password is: " + pwd);
			
			if (userName.equals("israel") && pwd.equals("israel")) 
			{
				console.format("Login successful");
			}	
		}
	}
}
