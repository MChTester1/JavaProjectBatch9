package com.class11;

public class GroupProject1Task7 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print 
		 * the first 10 numbers of Fibonacci series.
		 * 
		 */

int a=0;
int b=1;
int sum;
for(int i=1; i<=10; i++) {
	System.out.print(a+" ");

sum=a+b;

a=b;
b=sum;
}

System.out.println("---------------");
int Fibonacci = 0;
int Last = 1;
for (int i = 1; i <= 10; i++) {
 System.out.print(Fibonacci + " ");
 Fibonacci = Fibonacci + Last;
 Last = Fibonacci - Last;
} 
System.out.println();


System.out.println("---------------");
int f1=0;
int f2=1;
	for(int f=1;f<=10;f++) {
		System.out.print(f1+" ");
		f1=f1+f2;
		f2=f1-f2;
}
}
}