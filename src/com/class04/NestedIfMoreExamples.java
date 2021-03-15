package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		/*
		 * if it is Friday--> go to the movie, otherwise stay at home and study if it is
		 * friday then I will check if day is 13--> if yes--> I will watch scary movie,
		 * if no--> watch any movie you like
		 */
		boolean isFriday = true;
		int day = 13;
		if (isFriday) {
			System.out.println("It is a movie day!!!");
			if (day == 13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("I will watch any other movies");
			}
		} else {
			System.out.println("I will stay home and study Java");
		}

		System.out.println("-----------------------Example 2------------");
		/*
		 * check assignment and based on the score we display message
		 */
		boolean completed = true;
		int score=90;
		
		if(completed) {
			
			if(score>90) {
				System.out.println("Great job!!");
			}else if(score>80){
				System.out.println("Good job");
			}else if(score>70) {
				System.out.println("Good but let's try to do better");
			}else{
				System.out.println("Good job for trying but study more");
			}
		} else {
			System.out.println("Please make sure to complete all assignments on time");
		}
	}

}
