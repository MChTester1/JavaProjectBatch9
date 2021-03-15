package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*
		 * we need to identify favorite food
		 * we need to capture country from user
		 * based on the country identify favorite food
		 * 
		 */
		Scanner scan=new Scanner(System. in);
		String country, food;
		
		
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country.toUpperCase()) {//it has to match with your case   toLowerCase() or toUpperCase()
		
		case "USA":
			food="Burger";
			break;
		case "Poland":
			food="Pierogi";
			break;
		case "Vietnam":
			food="Pho";
			break;
		case"Belarus":
			food="Draniki";
				break;
		case "Mexico":
			food="Tacos";
				break;
			default:
				food="unknown";
		}
		
		System.out.println("Your favorite food is "+food);
	}

}
