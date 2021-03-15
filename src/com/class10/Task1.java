package com.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create an array of chars and store grades into:A, B, C, D,E,F
		 * Then print a grade B
		 */

		char [] grade;//declaration
		grade=new char[6];//initialization   //splitting works here
			grade[0]='A';
			grade[1]='B';
			grade[2]='C';
			grade[3]='D';
			grade[4]='E';
			grade[5]='F';
			System.out.println(grade[1]);
			
			System.out.println("---------------Another way of creating an array---------------");
			
			char[]grades= {'A','B','C','D','E','F','G'};//declaration stays the same but initialization is different way
			//char[]grades1;
			//grades1= {};  splitting declaration and initialization won't work 
			System.out.println(grades[6]);
			System.out.println("Numbers of elements in 2 array "+ grades.length);
	}

}
