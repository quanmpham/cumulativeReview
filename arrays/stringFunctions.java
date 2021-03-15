package arrays;

import java.util.Scanner;

public class stringFunctions {

	public static void main(String[] args) {
		System.out.print("Give me a string: ");
		Scanner userInput = new Scanner(System.in);
		String userData = userInput.nextLine();   //Saving this in a bucket (userData)
		
		//Create a program where you ask the user for a string
		//you as the programmer should let the user know about the following for their string
		//1. how many characters are in their string.
		int userDataLen = userData.length();
		System.out.println("Length: " + userDataLen);
		
		//2. You are going to add "Test" in the end of their given string
		String userDataConcat = userData.concat("Test");
		System.out.println("Concat: " + userDataConcat);
		
		//3. You are going to check if there is any "e" in their string
		boolean userDataContain = userData.contains("e");
		System.out.println("Contain e?: " + userDataContain);
		
		//4. You should tell the user if their string is equal to "hello" (Ignore case)
		boolean userDataEqual = userData.equalsIgnoreCase("hello");
		System.out.println("Equal hello?" + userDataEqual);
		
		//5. You should tell the user if their string is empty or not
		boolean userDataEmpty = userData.isEmpty();
		System.out.println("Empty?: " + userDataEmpty);
		
		//6. You should replace all o with 0 in their string.
		String userDataReplace = userData.replace("o", "0");
		System.out.println("Replace o with 0: " + userDataReplace);
		
		//7. Get the first 3 characters from their string.
		String userDataSub = userData.substring(3);
		System.out.println("SubString 1: " + userDataSub);
		String userDataSubStr = userData.substring(1, 3);
		System.out.println("SubString 1,3: " + userDataSubStr);
		
		
		//8. You should break down their string into single characters
		char[] userDataChar = userData.toCharArray();
		System.out.println("Single characters: "+userDataChar);
		//9. You should remove extra spaces from their string.
		String userDataRemoveSpace = userData.replace(" ", "");
		System.out.println("Remove space: "+userDataRemoveSpace);
	}

}
