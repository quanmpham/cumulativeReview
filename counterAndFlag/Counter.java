package counterAndFlag;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Counter {

	public static void main(String[] args) {
		int[] number = { 5, 6, 9, 5, 8, 6, 4, 3, 7, 6, 9, 5, 3, 1, 4, 55, 66 };

		// how many odd numbers are there.
		// System.out.println(number.length);
		// Tell me how many odd numbers are there
		// and tell what are they - remove the duplicates and print them in order

		// Flag
		boolean answer = true;

		if (answer) {
			Set<Integer> ts = new TreeSet<Integer>();

			int counter = 0;

			for (int item : number) {
				if (item % 2 == 1) {
					counter++;
					ts.add(item);
				}
			}
			System.out.println(number);
			System.out.println("Total Odd Number with duplicate: " + counter);
			System.out.println(ts);
			System.out.println("Total Odd Number without duplicate: " + ts.size());
			System.out.println(ts);
			
			Iterator itr = ts.iterator();
			while(itr.hasNext())
					System.out.print(itr.next());

		}
	}
}
