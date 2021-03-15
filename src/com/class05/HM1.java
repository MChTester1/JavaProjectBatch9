package com.class05;

import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
			Example: if user is born in June, July or August → season =“Summer”.
			At the end of the program we should see output as “You were born is season ______“.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=scan.next();
		String season;
		
		if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November")) {
			season="Fall";
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("February")) {
			season="Winter";
		}else {
			season="Spring";
		}
		System.out.println("You were born in season "+season);
	}
}
