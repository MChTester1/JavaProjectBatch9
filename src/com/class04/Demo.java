package com.class04;

import java.util.Scanner;
//shortcut to import scanner to windows:ctrl+shift+o
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		String str = "Hello";
		
	
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please enter any text");//captures entire text with spaces--> custom message telling us what to do
		String text=scan.nextLine();//scan.nextLine(); capture your input from console//once you enter text you must HIT ENTER
		System.out.println("text that I enter is "+ text);
		
		System.out.println("Please enter your name");
		String name=scan.next();//captures 1 word till space
		System.out.println("Nice to meet you "+ name);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		System.out.println("My name is "+ name+ " and I am "+age+ "years old");
	}

}
