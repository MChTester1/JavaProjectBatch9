package com.class08;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int money=0;
		System.out.println("Please pay for soda");
		money=scan.nextInt();
		
		while(money!=3) {
		
			if(money>3) {
				System.out.println("Please give less money");
			}else if(money<3) {
				System.out.println("Please give more money");
			}
			money=scan.nextInt();
		}
			System.out.println(" Thank you for your purchase");
		}
	}

