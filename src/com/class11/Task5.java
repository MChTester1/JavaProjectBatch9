package com.class11;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list.
			Inside you should have an array of veggies,
			 fruits, dairy and sweets. 
			 Retrieve all values from that array using 2 different loops
		 */
		String [][] grocery= {
				  {"carrots", "potatoes", "tomatoes"},
				  {"apple","banana", "kiwi"},
				  {"milk", "yogurt", "cheese"},
				  {"cookies", "bars","candy"},
		  };
				  
				  for(int r=0; r<grocery.length; r++) {
					  for(int c=0; c<grocery[r].length; c++) {
						  System.out.println(grocery[r][c]);
					  }
					  System.out.println();
				  }
				  for( String[] food:grocery) {
					  for(String c:food) {
						  System.out.println(c);
					  }
				  }
	}

}
