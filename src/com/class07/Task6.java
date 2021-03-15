package com.class07;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Print odd numbers from 20 to 50 (2 ways)
		 */
		for(int i=20; i<=50; i++) {
			if(i%2==1) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("--------------------");
		for(int i=21; i<=50; i+=2) {
			 
				System.out.print(i+ " ");
	}
			System.out.println();
			System.out.println("-------------------What is the output-------------");
			int sum=0;
			
			for(int i=1; i<=5; i++) {
				sum=sum+i;
			}
			System.out.println(sum);//its outside the loop; sum will be printed only once
			
			System.out.println();
			System.out.println("-------------------What is the output-------------");
			
			int result=0;
			
			for(int i=2; i<10; i+=2) {
				result +=i;
				//System.out.println(result);//output 2,6,12,20
			}
			System.out.println(result);//output 20 it is only one output
}
	}

