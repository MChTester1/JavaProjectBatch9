package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a program that will keep asking user to apply for a credit card. 
		 * As soon you get “yes” from a user program should stop asking.
		 */

		String text;
		String answer="yes";
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Please apply for a credit card");
		text=scan.nextLine();
		while(!answer.equalsIgnoreCase("yes")) {
			continue;
			
		}
  System.out.println("stop asking");
  
	}

}
