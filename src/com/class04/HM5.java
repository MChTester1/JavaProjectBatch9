package com.class04;

import java.util.Scanner;

public class HM5 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible 
		 * and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 * 
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter numbers of worked years");
		double yearsWorked=scan.nextDouble();
		System.out.println("Enter annual salary");
		double salary=scan.nextDouble();
		if(yearsWorked>=5) {
			System.out.println("You are eligible for the bonus");
			if(salary>50000) {
				System.out.println("You get 5000 bounus ");
			}else {
				System.out.println("You got 3000 bonus");
			}
		}else {
			System.out.println("You are not eligible for the bonus");
		}
	}

}
