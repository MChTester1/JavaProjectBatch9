package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=6;
 
 while(num<=5) {//while loop is used more often in programming compare to do while
	 System.out.println(num);
	 num++;
 }
 System.out.println("-----------------DO WHILE------------------");
 
 int num1=6;
 do {
	 System.out.println(num1);
	 num1++;
	 
 }while(num1<=5);
	}
		// while =first check then execute
		//Do=first execute then check
	
	//even when condition is false do will execute your code at least once
}
