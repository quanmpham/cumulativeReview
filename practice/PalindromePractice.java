package practice;

public class PalindromePractice {

	public static void main(String[] args) {
		String word = "racecar";
		char[] myArray = word.toCharArray();
		String reverseWord = "";
		for(int i=myArray.length-1;i>=0;i--) {
			reverseWord = reverseWord + myArray[i];
		}
		System.out.println(reverseWord);

	}

}
