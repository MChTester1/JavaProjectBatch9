package com.class02;

public class Task3 {

	public static void main(String[] args) {
		/*Write a program to print the area and perimeter of a rectangle 
		 * with width = 5 and  height = 8. Your program should say. 
		 * “The  perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
		 */
		
		int width=5;
		int height=8;
		
		int area=width*height;
		int perimeter=2*width+2*height;
		
		System.out.println("The perimeter of a rectangle with width " +width+ " and height " +height+ " is equal to " +perimeter+ " and the area is "+ area);

	}

}
