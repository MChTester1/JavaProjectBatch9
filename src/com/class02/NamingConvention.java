package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		
		// /keyword- a special words that are reserved in java memories;class, public, static, final, 
		
		//identifiers- name that  we give to classes, variables, and methods
		
		/*
		 * RILE!!!
		 * DO NOT USE KEYWORDS AS IDENTIFIERS
		 * Identifiers cannot contain space
		 * Identifiers cannot start with numbers
		 * Identifiers cannot have special characters except _ or $
		 */
		//1.int final=10;error; INVALID INDENTIFIER
		
		//2. byte variable one=12;
		//3. short 1b=12;
		short b1=12;
		
		//4.long*l=2000;
		//long l*=2000;
		
		long _l=2000;
		long long_=29990;
		
		double $price=12.99;
		double prce$=10.99;
		
		//NamingConvention
		//1.we use camel casing
		//2.classes starts with Upper cases and will follow camel casing
		//3.variables start with lowe case and will follow camel casing
		//4. packages we use lower case and use name as reverse way of url
		//5.use meaningful name for your variable
		
		
		int Number=12;//try not to use upper case names
		int number=12;//more preferable
		int numberOne=12;
		int numberTwo=13;
		
		boolean isSnow=true;
		boolean snow=true;
		
		
	}

}
