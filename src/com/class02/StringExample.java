package com.class02;

public class StringExample {

	public static void main(String[] args) {
		
		String name="Chris";
		String greeting ="Good Morning";
		String phoneNumber="123=456=7890";
		
		String stringNumber="12";
		String space=" ";
		String letter="A";
		String letter2="A ";
		char oneLetter='A';
		
		
		//How are you Chris?
		
		System.out.println("How are you "+ name +"?");
		
		int age =25;
		//I am 25
		
		System.out.println("I am "+ age);
		char grade='A';
		
		//Chris is A student
		
		System.out.println(name + " is "+ grade +" student");
		
		/*
		 * String concatenation operator + can be used when
		 * we attach String to another String
		 * we attach String to a number
		 * we attach String to any character or boolean
		 */
		
		String car="Tesla";
		int year=2021;
		
		//I drive 2021 Tesla
		
		System.out.println("I drive "+ year + " " +car);
		
		
		int memory=250;
		String computer="Macbook";
		
		//Chris has Macbook with 250 GB memory
		
		System.out.println(name + " has " + computer + " with " + memory +" GB memory");
		
		String combinedValue=year+ " "+car;//2021 Tesla
		System.out.println(combinedValue);

		int day =7;
		String month="February ";
		
		String date=month+day;
		System.out.println(date);
	}

}
