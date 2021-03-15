package com.class11;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		/*
		 * we want to create an array that will store elements fro a user
		 * 
		 */
		
		
		Scanner scan;
		String element;
		String[]array;
		
		scan=new Scanner(System.in);
				System.out.println("How many elements would you like to store?");
				int size=scan.nextInt();
				array=new String[size];
				
				for(int i=0; i<size; i++) {
					System.out.println("Please enter a String");
					array[i]=scan.next();
				}
				System.out.println("------Let's see what have we stored--------------");
				
				for(String str:array) {
					System.out.println(str);
				}
	}

}
