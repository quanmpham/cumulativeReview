package nestedIfElse;

public class Nested {

	public static void main(String[] args) {
		//If the number is odd and if the color = red then print hello
		//If the number is odd and if the color = green then print welcome
		//If the number is odd and color is not red not green then print bye
		//If the number is even and if the color = green then print hi
		//otherwise print bye
		
		int N = 6;//Odd is when you divide a number by 2 and remainder is 1
				   // Even is when you divide a number by 2 and remainder is 0
		
		String color = "rainbow";
		if(N%2==1) {
			if(color.equalsIgnoreCase("red")) {
				System.out.println("Hello");
				
			}
			else if(color.equalsIgnoreCase("green")) {
				System.out.println("Welcome");
			}
			else {
				System.out.println("bye");
			}
		}
		else if(N%2==0) {
			if(color.equalsIgnoreCase("green")){
					System.out.println("hi");
			}
			else {
				System.out.println("you were tricked");
			}
		}
		else {
				System.out.println("bye bye");
			}
		}


}
