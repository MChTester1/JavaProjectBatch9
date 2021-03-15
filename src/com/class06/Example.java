package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		/*we need to calculate final price after the discount
		 * 
		 * we check if there is sale
		 * if no sale--> not going shopping
		 * otherwise if there is sale
		 * we will ask the item
		 * we will ask the price
		 * 
		 * if price is less than $10--> apply 5% discount
		 * if price is between 10 and 100--> apply 10% discount
		 * if price between 100 and 500--> apply 20% discount
		 * if price is more than 500-apply 30% discount
		 * 
		 * "which item you purchased, what was original price, what discount applies and final price"
		 */

		
		Scanner scan=new Scanner(System.in);
		
		double price, discount=0, finalPrice=0;
		
		System.out.println("Do you have a sale?");
		String sale=scan.next();
		
		if(!sale.equalsIgnoreCase("yes")) {
			System.out.println("I am not going shopping");
		}else {
			System.out.println("Do you have the item?");
			String item=scan.next();
			if(item.equalsIgnoreCase("yes")) {
				System.out.println("What is the price?");
				price=scan.nextDouble();
				if(price>0 && price<10) {
					discount=price*0.05;
					
				}else if(price>=10 && price<100) {
					discount=price*0.1;
				
				}else if(price>=100 && price<=500) {
					discount=price*0.2;
				
				}
				finalPrice=price-discount;
				System.out.println("you will get 5% discount of "+ discount+" and final price is " + finalPrice);
			}else
				System.out.println("Not buying anything");
		}
	}

}
