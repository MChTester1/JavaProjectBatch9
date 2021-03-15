package com.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
			if the average score >=90 → grade=A
			if the average score >= 70 and <90 → grade=B
			if the average score>=50 and <70 → grade=C
			if the average score<50 → grade=F
		 */
		Scanner scan=new Scanner(System.in);
		
		int quiz, midTerm, finalScore,averageScore;
		char grade;
		System.out.println("Please enter your quiz score");
		 quiz=scan.nextInt();
		
		System.out.println("Please enter your midTerm score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter your finalScore");
		finalScore=scan.nextInt();
		
		averageScore=(quiz+midTerm+finalScore)/3;
		
		 
		if(averageScore>=90) {
			grade='A';
		}else if(averageScore>=70 && averageScore<90) {
			grade='B';
		}else if(averageScore>=50 && averageScore<70) {
			grade='C';
	}else {
		grade='F';
		}
		System.out.println("Your grade is "+ grade);
	}

}
