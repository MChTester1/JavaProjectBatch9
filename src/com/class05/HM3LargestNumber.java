package com.class05;

import java.util.Scanner;

public class HM3LargestNumber {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers
		 * using nested if provided by a user 
		 */

		int num1, num2, num3, largest;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers");
		num1 =scan.nextInt();
		num2 =scan.nextInt();
		num3 =scan.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("Numbers are equal");

		} else {

			if (num1 > num2) {// assuming num1 is bigger than num2
				if (num1 > num3) {
					largest=num1;
				} else {
					largest = num3;
				}
			} else {// assuming num2 is bigger than num1
				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3;
				}
			
			}
				System.out.println("The largest number amoung " + "num1 " + "num2 " + "num3 " + " is " + largest);
			}

		System.out.println("-----------------------------i am done-------------------------");
		
		}
}

	




