package com.class04;

import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You are a loan specialist and you need to ask user what is the amount
		 *  of loan is needed. If loan is less or equal to 200,000 
		 *  then you would lend the money otherwise you would reject the client.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the amount of loan");
		int amountOfLoan=scan.nextInt();
		if(amountOfLoan<=200000) {
			System.out.println("I will lend you the money");
		}else {
			System.out.println("You are rejected");
		}
		
	}

}
