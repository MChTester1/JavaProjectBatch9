package com.class07;

public class HM {

	public static void main(String[] args) {
		//calculate sum of odd and even numbers from 1 to 50
		System.out.println("-----------odd------------------");
		int sumOdd=0;
		
		for(int i=1; i<=50; i+=2) {
			sumOdd=sumOdd+=i;
		}
		System.out.println("The sum of odd numbers is " +sumOdd);
		
 System.out.println("--------------even -------------");
	int sumEven=0;
	
	for(int i=0; i<=50; i+=2) {
		sumEven=sumEven+=i;
	}
	System.out.println("The sum of even numbers is " +sumEven);
	
	System.out.println("-----------Another way/Preferable way--------------");
	
	int odd=0;
	int even=0;
	
	for(int i=0;i<=50; i++) {
		if(i%2==0) {
			even=even+i;
		}else {
			
			odd=odd+i;
		}
	}
	System.out.println("The sum of even numbers is "+even);
	System.out.println("The sum of odd numbers is "+ odd);
}
}