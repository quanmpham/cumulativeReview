package calculator;

import java.util.Scanner;

public class Multiplication_Matrix {

	public static void main(String[] args) {
		System.out.println("Please Enter A Number To Get The Multiplication Table: ");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				System.out.print(i*j+"\t");
			}System.out.println();
		}
		
	}

}
