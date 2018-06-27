package quickPrograms;
/*
 * Author: Terrell Martin
 * Date: 05/19/2018
 * Purpose: The dog class purpose is to simply output characteristics
 * of a dog given by the user within the main method.
 */
public class Dog {
	//instance variables
	int age;
	String name;
	String breed;
	String color;
	
	//Constructor
	public Dog(int age, String name, String breed, String color) {
		this.age = age;
		this.name = name;
		this.breed = breed;
		this.color = color;
	}
	
	//Methods


	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getBreed() {
		return breed;
	}
	
	//@Override
	public String toString() {
		return(" Dog name: " + this.getName() + "\n" +
	           " Dog Breed: " + this.getBreed() + "\n" +
			   " Dog color: " + this.getColor() + "\n" +
	           " Dog age: " + this.getAge());
	}
}
