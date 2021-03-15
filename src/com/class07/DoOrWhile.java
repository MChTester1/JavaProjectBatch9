package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		/*
		 * we play the lottery and we have the a winning number  which is 17
		 * we need to keep asking a user to enter any number from 1 to 100
		 * until correct number is enter
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int number;
		int lotteryNumber = 17;

		do {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			number = scan.nextInt();

		} while (number != lotteryNumber);
		System.out.println("Congratulations you entered " + number + " which is a lucky number");

	}

}
