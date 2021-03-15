package Abstraction;

public class A extends Y {

	public static void main(String[] args) {
		Y.test();
		
		
		//Abstract Class RULES:
		//1. Abstract Class can have abstract methods and NonAbstractMethods
		//2. To define a abstract Class -- use the Abstract word front class
		//3. To define a abstract methods -- use the Abstract word after the access modifier
		//   and make sure it is not implemented meaning have no {body}
		//4. Abstract class can inherit abstract class - no issues
		//5. Non Abstract class can inherit abstract class
		//   if there are no abstract methods with out any issues
		//   but if there are abstract methods, you have to make sure
		//   those abstract methods gets implements in the non abstract class
		//6. You cannot create an object out of Abstract Class.
	}
	
	public void hello() {
		System.out.println("hello");
	}
	
	public void hi() {
		System.out.println("hi");
	}
	public void printMe() {
		
	}
}
