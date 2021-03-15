package com.class05;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		/*
		 * ask user to enter age
		 * if age is from 1-3--> you are baby
		 * if age is from 3-5--> you are bigger baby
		 * if age from 5-12--> you are kid
		 * if age 13--19--> teenager
		 * if above 20--you are an adult
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
	 if(age>=1 && age<3) {
				System.out.println("You are baby");
			}else if(age>=3 && age<5) {
				System.out.println("you are bigger baby");
			}else if(age>=5 && age<=12) {
				System.out.println("You are kid");
			}else if(age >=13 && age<=19 ) {
				System.out.println("You are teenager");
			}else  if(age>=20){
				System.out.println("You are an adult");
			}else {
				System.out.println("you are not born yet");
			}
	}

}
