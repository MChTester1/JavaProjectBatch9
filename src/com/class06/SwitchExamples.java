package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		/*
		 * store gender using M or F
		 * based on the gender we will specify
		 * if M--> Male
		 * if F--> Female
		 * otherwise--> not sure
		 * 
		 */
		char gender='F';
		String description=null;
		
		switch(gender) {
		case 'M':
		description="Male";
		break;
		
		case 'F':
		description="Female";
		break;
		
		default:
		description="N/A";
	
		}
		System.out.println(description);
		/*
		 * LIMITATIONS:
		 * switch CANNOT use Relational or Logical Operators(it simply check value
		 * switch cannot work with all data type
		 * switch only works with byte, short, char, int, String
		 * doesn't work with boolean because there are only two values true or false
		 * doesn't work with double, float, long
		 * 
		 */
		
		boolean sunny=true;
		if(sunny) {
			System.out.println("I am happy");
		}
		double price=10.99;
				if(price>10) {
					System.out.println("Too expensive");
				}
		
	}

}
