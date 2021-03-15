package com.class03;

public class Task1 {

	public static void main(String[] args) {
		/* 1Declare variable and increase by 500 using shorthand operator
		 * 2.Declare variable and decrease by 67 using shorthand operator
		 *3.Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
		 *4.Declare variable cake=25 and divide cake between 7 people . 
			Using shorthand operator found out how many pieces of cake left
 			after it was distributed equally among 7 people
		 */
		
		int a=50;
		a+=500;
		System.out.println(a);
		
		
		a-=67;
		System.out.println(a);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int cake=25;
		cake/=7;
		System.out.println(cake);
		int cakeLeft =25%7;
		System.out.println(cakeLeft);
		
		
		

	}

}
