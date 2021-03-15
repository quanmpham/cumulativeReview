package assignment3;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		System.out.println("Enter a word to see if its a palindrome: ");
		Scanner userInput = new Scanner(System.in);
		String word = userInput.nextLine();
		String reverseStr = "";
		
		for(int i = word.length()-1 ; i>=0; i--) {
			reverseStr = reverseStr + word.charAt(i);
		}
		if(word.equals(reverseStr)) {
			 System.out.println("String is a palindrome");
			 
		 } 
		else {
			 System.out.println("String is not a palindrome");
		 }
		

	}

}
