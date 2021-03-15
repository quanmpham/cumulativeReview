package loops;

import java.util.ArrayList;
import java.util.Scanner;

public class whileLoops {

	public static void main(String[] args) {
		int i = 11;
		do{
			System.out.println("hellur");
			i++;
		}while(i<10);
		
		System.out.println("=================================================");
		int x = 1;
		while(x<10) {
			System.out.println("Skrrt");
			x++;
			break;
		}
		System.out.println("===================================================");
		
		String sentence = "Hello how is your day going? Get to Studying!!!";
		Scanner sc = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(sc.hasNext()) {
			words.add(sc.next());
		} System.out.println(words);
		
		
		

	}

}
