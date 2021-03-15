package calculator;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		System.out.println("Please Enter Grade To Get Letter Grade: ");
		Scanner userInput = new Scanner(System.in);
		int grade = userInput.nextInt();
		
		if(grade <= 100 && grade>=90) {
			System.out.println("Great job you've got an: A");
		}
		else if(grade <= 89 && grade>=80) {
			System.out.println("Good job you've got a: B");
		}
		else if(grade <= 79 && grade>=70) {
			System.out.println("You've got a: C");
		}
		else if(grade <= 69 && grade>=65) {
			System.out.println("Try to study more, you've got a: D");
		}
		else if(grade < 65) {
			System.out.println("Go back to studying, because you obviously didn't! LOL");
		}
		else {
			System.out.println("Invalid grade: ");
		}

	}

}
