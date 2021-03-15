package loops;

import java.util.Scanner;

public class Breaks {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 30) {
				break;
			}
			System.out.println(numbers[i]);
		}

		System.out.print("Enter a number! plz: ");
		Scanner userInput = new Scanner(System.in);
		int i = userInput.nextInt();

		switch (i) {
		case 0:
			System.out.println("hi");
			break;
		case 1:
			System.out.println("hello");
			break;
		case 2:
			System.out.println("hellur");
			break;
		default:
			System.out.println("nah fam! ");
			break;

		}
//			ArrayList<Integer> num = new ArrayList<Integer>();
//			num.add(10);
//			num.add(20);
//			num.add(30);
//			num.add(40);
//			num.add(50);
//			num.add(60);
//			
//			for(int j: num) {
//					System.out.println(num);
//			}

	}

}
