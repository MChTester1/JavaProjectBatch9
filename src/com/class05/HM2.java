package com.class05;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if 
		 * and logical operators provided by a user (numbers must be distinct)
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your number a");
		double a =scan.nextDouble();
		
		System.out.println("Please enter your number b");
		double b =scan.nextDouble();
		
		System.out.println("Please enter your number c");
		double c =scan.nextDouble();
		double largest;
		
		if(a<b && b<c) {
		largest=c;
		}else if (a>b && a>c){
		largest=a;
		}else {
		largest=b;
		}
		System.out.println("The largest number is "+largest);		
	}

}
