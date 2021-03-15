package assignment3;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		int num1;
		int num2;
		char operator;
		double answer= 0.0;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		num1 = userInput.nextInt();
		System.out.println("What operation? ");
		operator = userInput.next().charAt(0);
		System.out.println("Please enter second number: ");
		num2 = userInput.nextInt();

		
		switch(operator) {
		case '+' : answer = num1 + num2;
			break;
		case '-' : answer = num1 - num2;
			break;
		case '*' : answer = num1 * num2;
			break;
		case '/' : answer = num1 / num2;
			break;
			
		}
		
		System.out.println(num1+" "+operator+" "+num2+" = "+ answer);

	}

}
