package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// I want to capture 5 different names and say hello to every name
		//scanner, question, and statement will go inside the loop 
		Scanner scan=new Scanner(System.in);
		
		String name;
		
		int num=0;//num=10;
		
		while (num<5) {//num>5;
			System.out.println("Please enter your name");
			name=scan.next();
			System.out.print("Hello" + name+ " ");
			
			num++;//num--;
		}

	}

}
