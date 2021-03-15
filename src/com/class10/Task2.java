package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 */

		 String[]name=new String[5];
		 name[0]="Michal";
		 name[1]="Karina";
		 name[2]="Mateusz";
		 name[3]="Hubert";
		 name[4]="Magda";
		 System.out.println(name[4]);
		 
	
		 String[] name1= {"Michal","Karina","Mateusz","Hubert","Magda"};
		 System.out.println(name1[0]);
		 System.out.println(name1[1]);
		 System.out.println(name1[2]);
		 System.out.println(name1[3]);
		 System.out.println(name1[4]);
		 
		  System.out.println("-------------AllElements from an array--------");
		 
		 //how to get all elements from an array
		 for(int i=0; i<name.length; i++) {
			 System.out.println(name[i]);
		 }
	}

}
