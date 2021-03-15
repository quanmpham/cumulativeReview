package assignment3;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		
		if(N%2==1) {
			System.out.println("your number is odd");
		}
		else {
			System.out.println("your number is even");
		}
	}

}
