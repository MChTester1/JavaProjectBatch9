package com.class10;

public class AllElementsUsingAdvancedLoop {

	public static void main(String[] args) {
		
		int[]numbers= {10,14,78,5,90};
		//for each,enhanced for loop, advanced for loop USED ONLY with ARRAYS!!!! OR COLLECTIONS!!!!

		for(int num:numbers) {
			if(num%2==0) {
			System.out.print(num+" ");
			}
		}

		System.out.println();
		System.out.println("-----------");
		String[] name= {"Michal","Karina","Mateusz","Hubert", "Klaudia", "Maciek"};
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println("-------------------");
		
		for(String n:name) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("-----------");
		
		char[]grades= {'A','B','C','D','E','F'};
				
				for(char grade:grades) {
					System.out.print(grade);
				}
				System.out.println();
				System.out.println("-----------");
				boolean []boo= {true,false, false,false, true};
				for(boolean bo:boo) {
					System.out.print(bo+" ");
				}
		}
	}


