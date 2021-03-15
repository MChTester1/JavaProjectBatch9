package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		
		boolean morning=true;
		
		boolean classToday=true;
		
		//is it morning? --> Good morning
		 // if there is class: yes--hello classmates
		// otherwise -->hello my family
		
		if(morning) {
			System.out.println("Let me check if I class today");
			
			if(classToday) {
		
		System.out.println("Good morning my classmates");
	}else {
		System.out.println("Good morning my family");
	}
	}
	System.out.println("End of the code");
	
	
	System.out.println("------------Example 2-------------------------");
	
	boolean anyAllergy=true;
	
	boolean pollenAllergy= false;
	
	if(anyAllergy) {
		System.out.println("Let's check which allergies you have");
		if(pollenAllergy) {
			System.out.println("Do not get close to trees");
		}else {
			System.out.println("Ok you don't have pollen allergy");
		}
	}else {
		System.out.println("You are lucky not having any allergies");
	}

}
}
