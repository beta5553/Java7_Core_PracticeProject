package com.qb.israel.inheritance;

public class TenSpeedBycicle extends Bycicle {
	
	private float gearRatio = 2F; 
	private float wheelRPM;

	public void setGearRatio(float gearRatio){
		this.gearRatio = gearRatio;
	}
	
	@Override
	public void pedalRPM(float pedalRPM){
		this.wheelRPM = pedalRPM * gearRatio; 
	}
	
	public float getWheelRPM;
	
	@Override
	protected void anotherMethod() {
		// TODO Auto-generated method stub
		super.anotherMethod();
	}
	

	public void printSomething(){
		System.out.println("Print something Ten Speed Bycicle");
	}
	
}
