package com.class06;

import java.util.Scanner;

public class HMCalculatorUsingIfCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers and operator");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		char operator=scan.next().charAt(0);
		double result;
		
		if(operator=='+') {
		
			result=num1+num2;
		}else if(operator=='-') {
			result=	num1-num2;
			}else if(operator=='*') {
				result=num1*num2;
			}else if(operator=='/') {
				result=num1/num2;
			}else {
				result=0;
		
				System.out.println("You entered invalid operator");
		}
		
		if(result!=0) {
		System.out.println(result);

	}
	}

}
