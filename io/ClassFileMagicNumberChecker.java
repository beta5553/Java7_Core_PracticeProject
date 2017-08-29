package com.qb.israel.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

// this program will verify a binary file and identify if it is a valid .class 
// file based on its magic number (Hexadecimal signature).

public class ClassFileMagicNumberChecker 
{
	public static void main (String [] args) 
	{
		if (args.length != 1) {
			System.err.println("Pass a valid file name argument");
			//System.exit(-1);
		}
		
		String fileName = "C:\\Users\\israel.morales\\workspaceEE\\Java7CoreProject\\build\\classes\\com\\qb\\israel\\design_patterns\\dao\\DAOFactory.class";
		
		//Create a magic number byte array with the values for four bytes in 0xCAFEBABE.
		//you need to have an explicit downcast to byte since the next values like 0xCA are of type int.
		
		byte [] magicNumber = new byte [] {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};
		
		try (FileInputStream fis = new FileInputStream(fileName)) {
			// magic number is of 4 bytes, we will use a temporary buffer to read first four bytes.  
			byte [] u4Buffer = new byte[4];
			
			//read a buffer full (4 bytes here) of data from the file.
			//if read is successful.
			if(fis.read(u4Buffer) != -1) {
				if(Arrays.equals(magicNumber, u4Buffer)) {
					System.out.printf("the magin number for the passed file %s matches that of .class file", fileName);
					System.out.println("MagicNumber: " + magicNumber + "File Magic NUmber: " + u4Buffer);
				}
				else {
					System.out.printf("the magin number for the passed file %s doen not matches that of .class file", fileName);
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
