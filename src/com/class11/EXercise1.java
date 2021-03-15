package com.class11;

public class EXercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
		      for(int j=1; j<=10; j++){
		        if(i==1 && j==i+1 || i==2 && j==i+2 || i==3 && j==i+3 || i==4 && j==i+4 || i==5 && j==i+5){
		          System.out.print(i+" "+j);
		        }
		        System.out.println();
		      }
		      
		              }
	}

}
