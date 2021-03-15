package com.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i=10.99;//type mismatch
		
		
		//widening or implicit casting
		double d=10.99;
		System.out.println(d);
		
		//narrowing or explicit casting
		int i=(int)12.99;
		System.out.println(i);

		
		byte b=(byte)130;
		System.out.println(b);
		
		int number=12;
		double result=number/5;
		System.out.println(result);//2.0
		
		double newNum=10;//10.00
		newNum=newNum/3;//10.00/3;
		
		System.out.println(newNum);//3.3333
		
		
		double num1=10+10.5;
		System.out.println(num1);
		
	}

}
