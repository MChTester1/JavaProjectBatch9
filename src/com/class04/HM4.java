package com.class04;

import java.util.Scanner;

public class HM4 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card?
		 *  If balance of the card is larger than 1000, tell them to pay off immediately, 
		 *  otherwise you can tell them that they can spend more.
		 */
		
		boolean hasCard;
		 double balance;
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Do you have a credit card?"); 
		  hasCard=scan.nextBoolean();
		 
		  if(hasCard) {
		  System.out.println("What is the balance on the card?"); 
		   balance=scan.nextDouble();
		   
		  if(balance>1000) {
		  System.out.println("Pay your balance off immediately"); 
		  }else {
		  System.out.println("You can spend more"); 
		  }
		  
		  }else {
			  
		  System.out.println("Do you want to get a credit card?"); 
		  }
		
	}

}
