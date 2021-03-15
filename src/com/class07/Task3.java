package com.class07;

public class Task3 {

	public static void main(String[] args) {
		//Print even numbers from 20 to 100
		
		int num=20;
		
		while( num<=100) {
			System.out.print(num+" ");
			num+=2;
		}
		//System.out.println();
		//System.out.println("---------------different way------------------");
		
		//int num1=20;
		
		//while( num1<=100) {
			
		
			//if(num1%2==0) {
			//System.out.print(num1+" ");
			//      //num1 ++;//if this inside the brackets it will be infinite
			//}
			//num1 ++;//always outside to increment
		//}
			System.out.println("---------------------");
  for(int i=20; i<=100; i+=2) {
	  System.out.print(i+ " ");
	  
  }
	  
	}


}
