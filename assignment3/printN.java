package assignment3;

import java.util.Scanner;

public class printN {

	public static void main(String[] args) {
		//Given N-- Print this pattern up to N:1, 4, 8, 12, 16, 20…
		
		System.out.println("Enter any integer N");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		
		
		for(int i=0;i<=N*10;i=i+N) {
			System.out.println(i);
		}

	}

}
