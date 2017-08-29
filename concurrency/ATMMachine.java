package com.qb.israel.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATMMachine 
{
	
	public static void main (String [] args) 
	{
		Lock machine = new ReentrantLock();
		
		new Person(machine, "Israel");
		new Person(machine, "Luis");
		new Person(machine, "Raul");
		new Person(machine, "Karla");
		new Person(machine, "Erika");
		
	}
	
	static class Person extends Thread 
	{
		private Lock machine;
		
		public Person(Lock machine, String name){
			this.machine = machine;
			this.setName(name);
			this.start();
		}
		
		@Override
		public void run() {
			try {
				System.out.println(this.getName() + " waiting to access an ATM");
				machine.lock();
				System.out.println(this.getName() + " is accessign an ATM machine");
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			finally
			{
				machine.unlock();
			}
			
		}
	}
}
