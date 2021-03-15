package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		/*
		 * to donate: you must be 18 or older, otherwise you cannot 
		 * your weight must be more than 110lbs, otherwise you cannot donate
		 */
		int age = 30;
		int weight=140;
		
		if(age>=18) {
			if(weight>110) {
			System.out.println("You can donate based on your age and weight");
		}else {
			System.out.println("Your weight is too small, you can not donate");
		}
	  }else {
		  System.out.println("you can donate");

		}

  }
}
	

