package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int day=3;//work with conditions, it evaluate if condition is true or false
		String weekDay;
		
		if(day==1) { //deals with boolean
			// it checks all the conditions one by one
			//and when find it then goes to the if statement
			weekDay="Monday";
		}else if(day==2) {
			weekDay="Tuesday";
		}else if(day==3) {
			weekDay="Wednesday";
		}else if(day==4) {
			weekDay="Thursday";
		}else if(day==5) {
			weekDay="Friday";
		}else if(day==6) {
			weekDay="Saturday";
		}else if(day==7) {
			weekDay="Sunday";
	}else {
		weekDay="Invalid";
	}
 if(!weekDay.equals("Invalid")){
	 System.out.println("Today is "+weekDay);
 }
 System.out.println("---------------using switch-------------------");
  
 String weekDay1;
 		switch(day) {//is a value based 1, 2, 3....
 		//we CANNOT have a duplicate value
 		//values MUST match variable type
 		//we MUST have break in every case
 		//deals with value
 		//it jumps right away to the matching case;
 		//it's not going one by one
 		case 1:
 			weekDay1="Monday";
 			break;
 		case 2:
 			weekDay1="Tuesday";
 			break;
 		case 3:///it jumps right away to the matching case;
 			weekDay1="Wednesday";
 			break;
 		case 4:
 			weekDay1="Thursday";
 			break;
 		case 5:
 			weekDay1="Friday";
 			break;
 		case 6:
 			weekDay1="Saturday";
 			break;
 		case 7:
 			weekDay1="Sunday";
 			break;
 		default:
 			weekDay1="Invalid";
 			break;
 		}
 		System.out.println(weekDay1);///
 		if(!weekDay1.equals("Invalid")){
 			 System.out.println("Today is "+weekDay1);
}
}
}