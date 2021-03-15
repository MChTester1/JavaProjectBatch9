package com.class05;

import java.util.Scanner;

public class Task1BetterWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height=scan.nextInt();
		
		
		String definition;
		
		if(height<60) {
			definition="short";
		}else if(height>=60 && height<=72) {
			definition=" medium";
		}else {
			definition=" tall";
		}
		System.out.println("You are the person who's height's is"+ definition);
	}


	}



