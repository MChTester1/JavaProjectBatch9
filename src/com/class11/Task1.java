package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner
		 * calculate the sum of all stores elements in that array */
		   
		double sum=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the size of the arr: ");
		int size= scan.nextInt();
		double[] a=new double [size];
		
		for(int i=0; i<size; i++) {
			a[i]=scan.nextDouble();
			sum+=a[i];
			
		}
		System.out.println("The sum of "+size + " elements from an array= "+sum);
		System.out.println("---------calculating sum using for each loop----------");
		sum=0;
		
		for(double num:a) {
			sum+=num;
		}
		System.out.println("The sum of "+size +" elements from an array ="+sum);

	}

}
