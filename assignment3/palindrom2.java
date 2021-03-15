package assignment3;

import java.util.Scanner;

public class palindrom2 {

	public static void main(String[] args) {
		System.out.println("Enter a string to see if its a palindrome");
		Scanner userInput = new Scanner(System.in);
		String original = userInput.nextLine();
		
		//String original = "nurses run";
		original = original.replace(" ", "");
		
		
		String reverse = "";
		for(int i = original.length()-1; i>= 0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		}
		boolean palindrome = true;
		for(int i=0; i<original.length(); i++) {
			if(original.charAt(i) !=reverse.charAt(i)) {
				palindrome = false;
			}
		}
		if(palindrome) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
