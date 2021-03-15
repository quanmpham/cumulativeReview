package practice;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number to see if its a palindrome: ");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int temp = number;
		int reverse=0;
		int remainder =0;
		
		while(temp!=0) {
			remainder = temp%10;
			reverse = reverse *10 + remainder;
			temp=temp/10;
		}
		if(number==reverse) {
			System.out.println("Your number is a palindrome");
			System.out.println("number:"+ number + " =" + " reverse:" + reverse);
		}else {
			System.out.println("number:"+number+" is not equal to:"+"reverse:"+reverse);
		}
		

	}

}
