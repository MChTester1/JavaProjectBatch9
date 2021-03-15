package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int number = 1;
		int lotteryNumber=17;
		
		
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		number=scan.nextInt();
		
		while(number !=lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			number=scan.nextInt();
			number++;
		}
		System.out.println("Congratulations you entered "+ number+" which is a lucky number");
	}

}