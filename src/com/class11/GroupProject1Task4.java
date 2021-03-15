package com.class11;

public class GroupProject1Task4 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of countries: north america countries, 
		 * south america countries, europe countries, asian countries, african countries. 
		 * Then print all values from that array using 
		 * 2 different loops and calculate how many total countries have been stored.
		 */
		
		int count=0;
    String [][]countries= {
    		{"USA","Canada","Mexico","Guatemala"},
    		{"Brazil","Colombia","Argentina","Peru"},
    		{"Poland","Sweden","Czech","Hungary","Spain","Austria"},
    		{"China","Pakistan","India","Indonesia"},
    		{"Nigeria","Ethiopia","Egypt","Kenia","Uganda"},
    };
    for(int r=0; r<countries.length; r++) {
    	for( int c=0; c<countries[r].length;c++) {
    		System.out.print(countries[r][c]+" ");
    }
	System.out.println();
	
    
	}
    System.out.println("-----------------");
	for( String[] country:countries) {
		for( String c: country) {
		System.out.print(c+" ");
		count++;
	}
		System.out.println();
	}
		int sum=countries[0].length+countries[1].length+countries[2].length+countries[3].length+countries[4].length;
		System.out.println(sum);
}
}

