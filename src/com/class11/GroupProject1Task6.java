package com.class11;

import java.util.Scanner;

public class GroupProject1Task6 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */
		
		Scanner scan=new Scanner(System.in);
				System.out.println("Please enter the number");
				int number=scan.nextInt();
	
		 
			
					 if(number==2 || number%2!=0)  {
				 if(number!=0 && number!=1  ) {
				 System.out.println("It is a prime number");
				 }
			 }else{
				 System.out.println("Not a prime number");
			 }
		 }
	}



//int num=34;
//boolean flag=false;
//
//if (num>1){
//for (int i=2; i<num; i++) {
//	//condition for non prime number
//	if(num%i==0) {
//		flag=true;
//		break;
//	}
//}
//}else{
//flag=true;
//}
//if(!flag)
//
//System.out.println(num+" is a prime number");
//else
//	System.out.println(num+" is not prime number");
//}
//}
//
//if (!prim) {
//	System.out.println(num+" is a prim number");
//}else {
//	System.out.println(num+" is a nonprim number");
//}
//
//or
//or (int i=2; i<num/2; i++) {
//	if(num%i==0) {
//		isPrime=false;
//		break;
//	}
//} or
//
//for (int i = 2; i <= num / 2; i++) {
//	if (num % i == 0) {
//		isPrime = true;
//		break;
//	}
//}
//if (!isPrime)
//	System.out.println(num + ” is a prime number.“);
//else
//	System.out.println(num + ” is not a prime number.“);
//}
//
//
//or
//Scanner input= new Scanner(System.in);
//
//System.out.println("Please enter a number");
//
//int num=input.nextInt();
//
//if(num%2!=0 || num==2) {
//	
//	if (num%3==0 || num%5==0 || num%7==0 || num%11==0 || num==2) {
//		
//	System.out.println("This is a prime number");
//	}
//	
//}else {System.out.println("This is not a prime number");}
