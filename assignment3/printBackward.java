package assignment3;

import java.util.Scanner;

public class printBackward {

	public static void main(String[] args) {

//		System.out.println("Enter a number to print backward to 0 ");
//		Scanner userInput = new Scanner(System.in);
//		int N = userInput.nextInt();
//		
//		for(int i=N;i>=0;i=i-1) {
//			System.out.println(i);
//			
//		}
		
		System.out.println("Enter a word to print it backwards: ");
		Scanner userInput = new Scanner(System.in);
		String backWord = userInput.nextLine().replace(" ", "");
		String palindrome ="";
		for(int i=backWord.length()-1; i>=0; i--) {
			palindrome= palindrome+ backWord.charAt(i);
			
		}
		
		System.out.println(palindrome);
	}

}
