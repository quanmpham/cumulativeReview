package practice;

public class PracticingJava {

	public static void main(String[] args) {
//		// Manual sort with arrays
		int[] myArray = { 1, 2, 4, 2, 3, 5, 6, 4, 2, 7, 9, 4, 5 };
		int temp = 0;

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j <myArray.length; j++) {
				if (myArray[i] < myArray[j]) {
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		//After sorting, this loop will print out only the odd numbers in the above Array
		for(int x: myArray) {
			if(x%2==1) {
				System.out.println(x);
			}
		}
		System.out.println("==========================================");
//		//Palindrome
		
		String word = "racecar";
		char[] myArrays = word.toCharArray();
		String reverseWord = "";
		
		for(int p=myArrays.length-1;p>=0;p--) {
			reverseWord = reverseWord+ myArrays[p];
		}
		if(word.equalsIgnoreCase(reverseWord)) {
			System.out.println(reverseWord);
			System.out.println("Your word is a palindrome");
		}else {
			System.out.println("Your word is not a palindrome");
		}
		System.out.println("=======================================================");
		//Print from 1 to N
		//When number is a multiple of 7, print out "Dude"
		//When number is a multiple of 9 print out "Wheres my car?"
		//When number is both a multiple of 7 and a multiple of 9 print out "Dude, Wheres my car?"
		
		int N= 100;
		for(int i=1;i<=N;i++) {
			if(i%7==0 && i%9==0) {
				System.out.println("Dude, Wheres my car?");
			}
			else if(i%7==0) {
				System.out.println("Dude");
			}
			else if(i%9==0) {
				System.out.println("Wheres my car?");
			}
			else {
				System.out.println(i);
			}
		}
		//Multiplication Matrix Table
		
		int m= 10;
		for(int k=1;k<=m;k++) {
			for(int o=1;o<=m;o++) {
				System.out.print(k*o+"\t");
			}
			System.out.println();
		}
		System.out.println("==================================================");
		
		int[] num = {1,1,4,5,6,5,7,8,13,12,15,11,19,10,20};
		for(int a: num) {
			if(a%2==1) {
				System.out.println(a);
			}
		}
		System.out.println("====================================================");
		int M= 100;
		for(int i=0;i<=M;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		//Switch 
		
		String a="cube";
		String b ="circle";
		String c= "";
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
			
	}

}
