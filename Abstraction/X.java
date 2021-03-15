package Abstraction;

public class X extends Y {

	public static void main(String[] args) {
		
		
	}
	
	public void hello() {
		System.out.println("hi");
	}
	
	public  void printMe() {
		
	}
	
	//In order to inherit an abstract class to nonabstract class
	//then you have to make sure you implement(meaning provide curly brace)
	//to all your abstract methods
	//Rule for Abstract Method: in order to have abstract 
		//method the class has to be abstract
	//Abstract Class that has an abstract method will not be easily inherited
	//When a non-abstract class try to inherit an abstract class
		// you have to IMPLEMENT the abstract method with a BODY
	
	//you want the user to have the freedom to use their own implementation
	//you want them to know what is available but you dont want to give them the actual code
	//basically hiding the body(detail) of it, signature of it but you want them to implement it
	//INTERVIEW QUESTION: How can i accomplish 100% abstraction
		//Ans: Interface, is the way to do 100% abstraction instead of abstract 
		//class because abstract class can have abstract and non abstract methods
	public int sum(int a, int b) {
		return a+b;
	}

}
