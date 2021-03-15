package com.class03;

public class HM {

	public static void main(String[] args) {
		// Write a program to check whether number is positive or negative.
		 

		int number=-3;
		if(number>0) {
			System.out.println("The number "+number+ " is positive");
		}else if(number<0){
			System.out.println("The number "+number+" is negative");
		}else {
			System.out.println("The number is neither positive or negative");
		}
		
		//2.* Write a Java Program to check whether number is Even or Odd.
		
		int num=9;
		if(num%2!=0) {
			
			System.out.println(num+ " Odd number");
		}else {
			System.out.println(num+ " Even number");
		}
		
		int nume=8;
		if(nume%2==0) {
			
			System.out.println(nume+" Even number");
		}else {
			System.out.println(nume+  " Odd number");
		
	}

}
}


