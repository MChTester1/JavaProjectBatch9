package com.class08;

import java.util.Scanner;

public class Task2DifferentWay {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		String answer;
		do {
		System.out.println("Please apply for a credit card");
		answer=scan.nextLine();
		}while(!answer.equalsIgnoreCase("yes")) ;
			
			 System.out.println("stop asking");
			 System.out.println("------------");
	}

}
