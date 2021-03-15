package com.class13;

public class Dog {
	/*Create a Dog Class and create 3 different objects of it: 
	Husky, Bulldog, Labrador  with specific  attributes and behaviors.
 */
		
		public String breed;
		 public String size;
		 public String color;
		 public int age;
		 public void bark() {
			 System.out.println("ruff ruff ruff");
		 }
		public void sleep() {
			System.out.println("zzzz");
		}
		
		public void eat() {
			System.out.println("yum");
		}
		public void look() {
				System.out.println("Hi I am a dog my color is "+ color);
			}
		
		 public static void main(String[] args) {
		 Dog husky=new Dog();
			husky.breed="Husky";
			husky.size="Large";
			husky.color="Black";
			husky.age=5;
			husky.look();
			
			Dog bulldog=new Dog();
			bulldog.breed="AmericanBulldog";
			bulldog.size="Large";
			bulldog.color="White";
			bulldog.age=6;
			bulldog.bark();
			bulldog.sleep();
			bulldog.look();
			bulldog.eat();
			
			Dog labrador=new Dog();
			labrador.breed="Labrador";
			labrador.size="Large";
			labrador.color="Tri";
			labrador.age=7;
	}
	}


