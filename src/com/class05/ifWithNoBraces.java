package com.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
		
		String day="Saturday";
		System.out.println("---------If without braces--------------");
		
		
		
		if(day.equals("Friday"))
			System.out.println("Today is my movie day");//won't execute when condition is false-->friday, Saturday, etc.
			System.out.println("Tomorrow I have a class at Syntax");//it will execute
			
		
		
System.out.println("---------If with braces--------------");//always use braces

		
		
		if(day.equals("Friday")) {
			System.out.println("Today is my movie day");
			System.out.println("Tomorrow I have a class at Syntax");
			
		}
			
		System.out.println("------End of the program------------");
		
		int num=10;
		if(num>=10)
			System.out.println("number is larger than 10");//this belongs to if statement
		else//if no braces java identifies only 1 statement per block (if block or else block)
			System.out.println("Number is less than 10");//this belongs to else statement
		System.out.println("Second statement inside else block");//this statement is not part of if or else condition; it is treated as a seperate
	}

}
