package com.class06;

import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * Ask user to enter their country and capture it. 
 * Once values are captured print which language user speaks.
 * 
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		String language;
		switch(country) {
		case "Poland":
			language="polish";
			break;
		case "USA":
			language="american";
			break;
		case "Spain":
			language="spanish";
			break;
		case "Hungary":
			language="hungarian";
			break;
		case "Great Britain":
			language="british";
			break;
			default:
			language="own language";
			
		
		}
		
		System.out.println(language);
	}
	
}
