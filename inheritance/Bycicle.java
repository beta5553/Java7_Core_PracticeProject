package com.qb.israel.inheritance;

public class Bycicle {
	
	private float wheelRPM;
	private int degreeOfTurn; 
	
	public void  pedalRPM(float pedalRPM) {
		float gearRatio = 2F;
		this.wheelRPM = pedalRPM * gearRatio; 
	}

	public float getWheelRPM() {
		return wheelRPM;
	}

	public int getDegreeOfTurn() {
		return degreeOfTurn;
	}

	public void setDegreeOfTurn(int degreeOfTurn) {
		this.degreeOfTurn = degreeOfTurn;
	}
	
	protected void anotherMethod(){
		
	}
	
	void other(){}
	
	public void printSomething(){
		System.out.println("Print something Bycicle");
	}
}
