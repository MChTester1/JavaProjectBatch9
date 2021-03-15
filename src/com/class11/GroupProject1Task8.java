package com.class11;

public class GroupProject1Task8 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */
	
 int [] numbers= {2, 4,5};
  int smallest=numbers[0];
int largest=numbers[0];

  for(int i=1; i<numbers.length; i++ ) {
	   if(numbers[i]>largest) {
		   System.out.println("num1 is max");
	   }else if(numbers[1]> numbers[2]) {
		   System.out.println("num2 is max");
	   }else {
		   System.out.println("num3 is max");
	   }
	   
   }
	}

}
/// Maximum and minimum number in the array?
//		int[] myArray= {9,66,45,65,32,876,0,-900};
//		
//		int max=myArray[0];
//		int min=myArray[0];
//		
//		for(int i=1;i<myArray.length; i++) {
//			if(myArray[i]>max){
//				max=myArray[i];
//			}
//			if(myArray[i]<min) {
//				min=myArray[i];
//			}
//		}
//	}
//
//
//}
