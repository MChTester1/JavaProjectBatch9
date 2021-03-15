package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//1st way to create a variable
		short b=200;//create a variable and assign value
					//declare a variable and initialized
		//2nd way
		int sum;//declaration happens ONLY ONCE
		sum=20;//initialized the variable
		
		sum=30;//reassign the value
		
		/*
		 * int x;
		 * int y;
		 * int z;
		 */
		
		int x,y,z,w,q;
		x=10;
		y=20;
		z=30;
		
		//i would like to change the value of x
		
		x=70;
		System.out.println(x);
		
		//we are using value of different variable to initialize the value of new variable
		int num=33;
		int num2=num;
		System.out.println(num2);
	}

}
