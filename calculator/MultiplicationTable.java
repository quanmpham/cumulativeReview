package calculator;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter a number for the multiplication table: ");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		
		for(int i=N;i<=N*10;i=i+N) {
			System.out.println(i);
		}

	}

}
