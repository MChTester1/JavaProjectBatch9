package com.class11;

public class GroupProject1Task1 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type and store numbers 
		 * in 3 rows and 3 columns. Print the sum of all numbers.
		 */
		
		int [][] numbers= {
				{1,2,3,6},
				{14,15,16},
				{23,25,27},
				
		};
		int sum=0;
		for(int r=0;r<numbers.length;r++) {
			for(int c=0; c<numbers[r].length; c++) {
				sum+=numbers[r][c];
			}
				System.out.println(sum);
		}
}
	}
			
		
	
