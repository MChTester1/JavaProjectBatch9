package com.class11;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */
  String [][] cars= {
		  {"Chevrolet","Jeep", "Hammer", "Chrysler","Lincoln"},
		  {"BMW","Volgswagen","Audi"},
		  {"Hyundai", "Kia"},
		  {"Fiat", "Maseratti", "Ferrari", "Alfa Romeo"},
  };
		  
		  for(int r=0; r<cars.length; r++) {
			  for(int c=0; c<cars[r].length; c++) {
				  System.out.println(cars[r][c]);
			  }
			  System.out.println();
		  }
  }
	}


