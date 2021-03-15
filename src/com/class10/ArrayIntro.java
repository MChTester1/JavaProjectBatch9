package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		 num=20;
		 System.out.println(num);
 
		 System.out.println("----------------");
		 int[] array=new int[5];
		 array[0]=10;
		 array[1]=12;
		 array[2]=15;
		 array[3]=9;
		 array[4]=13;
		 System.out.println(array[0]+array[4]);
		 
		 double []numbers=new double[2];
		 numbers[0]=10;
		 numbers[1]=19.01;
		 System.out.println(numbers[0]);
		 
		 numbers[0]=11.99;
		 System.out.println(numbers[0]);
		 
		 //Arrays are fixed in size
		 
		 String[] names=new String[4];
		names[0]="Magda";
		 names[1]="Michal";
		 names[2]="John";
		 //names[3]="Zosia;"//default value=null
		 //names[4]="Julia";//ArrayIndexOutOfBoundsException
		 System.out.println(names[2]);//Michal
		 
		 int[] nums=new  int[3];//more preferable way 
		 System.out.println(nums[1]);//if no values stores compiler adds default values to the array-->0
		 
		 boolean b[] =new boolean[3];
		 b[0]=true;
		 b[1]=true;
		 b[2]=false;
		 System.out.println(b[2]);
		 
		 int size=b.length;
		 System.out.println(size);
		 
		 
	}

}
