package com.class06;

import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {
		/*
		 * 
		 * HomeWork: Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers and operator");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		char operator=scan.next().charAt(0);
		int result=0;
		int add=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		switch(operator) {
		case '+':
			result=add;
			break;
		case'-':
			result=sub;
			break;
		case '*':
			result=mult;
			break;
		case '/':
			result=div;
			break;
			default:
				result=0;
				System.out.println("You entered invalid operator");
		}
		
		if(result!=0) {
		System.out.println(result);

	}
}
}
