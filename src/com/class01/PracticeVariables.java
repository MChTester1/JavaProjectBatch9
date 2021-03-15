package com.class01;

public class PracticeVariables {

	public static void main(String[] args) {
		/*Create a Java program and name it Practice Variables
		 * In your program create variables to store all different
		 *  types of primitive data to test the range
		 *  Print the value of each variable
		 */

		byte b= 10;//creating  a variable and assigning value to it
		short s= 287;
		int i= 3456;
		long l=2334568l;
		float f= 24.34f;
		double d= 87.98d;
		char c='M';
		boolean bool=false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		
	System.out.println();
	b=2;//reassign the value(change the value of the variable)
	System.out.println(b);
	
	//byte b=20; duplicate variable, Java complains
	
	//i=12.99; error type mismatch; because variable i can only hold int type of value
	
	//i=true;
		

	}

}
