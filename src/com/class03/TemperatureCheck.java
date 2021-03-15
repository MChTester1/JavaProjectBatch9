package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		/*
		 * Create a Java program and name it Temperature Check.
		 *  Create variable to store temperature. 
		 * Your program should check if temperature is below 32 
		 * then it should print “Water will freeze with temperature __“, 
		 * otherwise “Water will NOT freeze with temperature __“.
		 * 
		 */
		
		double temp=30;
	
		if(temp<32) {
			System.out.println("Water will freeze with temperature "+ temp );
			System.out.println("It is very cold");
		}else {
			System.out.println( "Water will NOT freeze with temperature "+temp);
		}
	
	
	double money=5;
	double $coke=3;
	
	if(money==$coke) {
		System.out.println("I am buying soda");
	}else {
		System.out.println("I need exact money");
	}
	
	boolean snow=true;
	if(snow) {
		System.out.println("I will play outside");
	}else {
		System.out.println(" I will ride a bike");
	}
	
	boolean summer=false;
	if(summer) {
	System.out.println(" I am going to Florida");
	}else {
		System.out.println("I will stay home");
	}
	
}
}

