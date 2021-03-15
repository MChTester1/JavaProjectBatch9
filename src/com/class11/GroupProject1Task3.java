package com.class11;

public class GroupProject1Task3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type where 
		 * you will store integer values in 3 rows and 4 columns. 
		 * Develop a program which will calculate 
		 * the sum of  even and odd numbers for that array.
		 */
		int evenSum=0;
		int oddSum=0;
		int [][] numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		 for (int r=0; r<numbers.length; r++) {
			 for(int c=0;c<numbers[r].length; c++) {
				 if(numbers[r][c]%2==0) {
					 evenSum+=numbers[r][c];
					 System.out.print(evenSum);	
						
				 }else if(numbers[r][c]%2!=0) {
					 oddSum+=numbers[r][c];
				 System.out.print(oddSum);
				 }
				
			 }
		 }
}
}


