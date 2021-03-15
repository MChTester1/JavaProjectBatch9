package com.class11;

public class GroupProject1Task2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type where you will store odd and even numbers in 3 rows and 4 columns.
		 *  Develop a program which will identify/print the even numbers only.
		 */
		
		int[][] numbers= {
				{1,2,3,3},
				{4,6,8,9},
				{10,21,34,55},
		};
		for(int r=0;r<numbers.length;r++) {
			for(int c=0; c<numbers[r].length; c++) {
				if(numbers[r][c]%2==0) {
					System.out.println( "Even numbers are: "+ numbers[r][c]+" ");	
				}
				
				}
			
			}
		}
}
	
