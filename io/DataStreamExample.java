package com.qb.israel.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
	
	public static void main (String [] args) {
	//write some date  into a data file with hard-coded name "temp.data"
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp.data"))){
			//write values from 1-10 as byte, short, int , long, float and double.
			//Omitting boolean since it cannot be converted to int.
			
			for(int i=0; i<10; i++) {
				dos.writeByte(i);
				dos.writeShort(i);
				dos.writeInt(i);
				dos.writeLong(i);
				dos.writeFloat(i);
				dos.writeDouble(i);
			}
			
		} 
		catch (FileNotFoundException e) {
			System.err.println("Cannot create a fle with the fiven file name");
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.err.println("An IO error ocurred while processing. ");
			e.printStackTrace();
		}
		
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("temp.data")))
		{
			for(int i=0; i<10; i++) {
				System.out.printf("%d %d %d %d %g %g %n",
				dis.readByte(),
				dis.readShort(),
				dis.readInt(),
				dis.readLong(),
				dis.readFloat(),
				dis.readDouble());
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
