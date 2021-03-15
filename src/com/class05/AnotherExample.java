package com.class05;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		/*
		 * we have to calculate commission based on sales ask user to enter sale that he
		 * made based on sale we will calculate commission
		 * if sale is less than 10--> commission is 0
		 *  if sale is between 10 and 100--> commission is 10% 
		 *  if sale is between 101 and 500--> commission is 20%
		 * if sale is between 501 and 1000--> commission is 30% if sale more than
		 * 1000--> commission is 50%
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		double saleAmount, commission;
		System.out.println("Please enter sale amount");
		saleAmount=scan.nextDouble();
	
		
		if(saleAmount<10) {
			commission=0;
		}else if(saleAmount>=10 && saleAmount<=100) {
			commission=saleAmount*0.10;
		}else if(saleAmount>100 && saleAmount<=500 ) {
			commission=saleAmount*0.20;
		}else if (saleAmount>=501 && saleAmount<=1000){
			commission=saleAmount*0.3;	
		}else{
			commission=saleAmount*0.5;
		}
		 System.out.println("your daily commission is "+ commission);
		/*
		 * if commission is more than 500--you are amazing seller
		 */
		 if(commission>500) {
			 System.out.println("You are amazing seller");
		 }
	}
		}


