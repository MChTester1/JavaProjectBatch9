package com.class04;

import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into 
		 * celsius and print “The temperature is the city __ is __”
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter city");
		String city=scan.nextLine();
		System.out.println("Please enter temperature");
		double tempF=scan.nextDouble();
		double tempC= (tempF - 32) / 1.8;
		
		System.out.println("The temperature in the city "+ city+ " is "+ tempC);
	}

}
