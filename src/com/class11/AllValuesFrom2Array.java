package com.class11;

public class AllValuesFrom2Array {

	public static void main(String[] args) {
		
		
		String[][] usa= {
				{"Alexandria", "Oakton","Arlington","Virginia Beach", "Fairfax"},
				{"Philly","Strassburg","Pittsburg"},
				{"Boston","Quincy", "Springfield","Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento","Santa Barbara"},
				{"Miami","Orlando","Tampa", "Tallahasee"},
		};
		//System.out.println(usa.length);//5 total rows/5 single arrays
		//System.out.println(usa[0].length);//5 elements inside 1 array/5 columns in 1st row
		//System.out.println(usa[1].length);//3 elements in 2 nd row
		//System.out.println(usa[2].length);//4 
		
		for( int r=0; r<usa.length; r++) {//iterates over rows
			for(int c=0; c<usa[r].length; c++ ) {
				System.out.println(usa[r][c]+" ");
				
			}
			System.out.println();
			
		}
System.out.println("----using nested for each loop-------------");

for(String[] cities :usa) {
	for(String city:cities) {
		System.out.println(city+" ");
	}
	System.out.println();
}
	}

}
