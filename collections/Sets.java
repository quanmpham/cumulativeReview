package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// SET: cant have any duplicate
		// 3 Types SET: HashSet, LinkedHashSet, TreeSet

//		Set<String> sh = new HashSet<String>();
//		
//		sh.add("AP");
//		sh.add("John");
//		sh.add("Jane");
//		sh.add("Tom");
//		sh.add("Tim");
//		sh.add("Larry");
//		sh.add("Levi");
//		sh.add("AP");
//		sh.add("Anki");
//		sh.add("John");

//		System.out.println(sh); //Result: No specific order and no duplicate
//		for(String item: sh) {
//			System.out.println(item);
//		}

//		Object[] myArr =sh.toArray();
//		System.out.println(myArr[1]);
//		Arrays.sort(myArr);
//		System.out.println(myArr[0]);

//		System.out.println("=====================================");
//		
//		Set<String> lsh = new LinkedHashSet<String>();
//		lsh.add("AP");
//		lsh.add("John");
//		lsh.add("Jane");
//		lsh.add("Tom");
//		lsh.add("Tim");
//		lsh.add("Larry");
//		lsh.add("Levi");
//		lsh.add("Anki");
//		
//		System.out.println(lsh);
//		
//		System.out.println("=================================");
//		
//		Set<String> ts = new TreeSet<String>();
//		ts.add("AP");
//		ts.add("John");
//		ts.add("Jane");
//		ts.add("Tom");
//		ts.add("Tim");
//		ts.add("Larry");
//		ts.add("Levi");
//		ts.add("Anki");
//		
//		System.out.println(ts);

		// SET: HashSet, LinkedHashSet, TreeSet
		// SET: No Duplicate
		// HashSet: In Random Order
		// LinkedHashSet: In Order the way you add them
		// TreeSet: In alphabetical order

		// When do you use set over list: lets say you are automating a scenario, a
		// workpage
		// and you go to all the diff accounkt and transactions and you
		// want to capture the data and you do not care what youre saving
		// you use list, lets say you look for checking account number,
		// you only want to get the checking account number one time
		// and no duplicate then you use set

		int[] a = { 2, 3, 1, 4, 5, 6, 7, 5, 7, 8, 19 };
		Set<Integer> ts1 = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			ts1.add(a[i]);
		}
		System.out.println(ts1);
		System.out.println(ts1.hashCode());
		System.out.println(ts1.size() - 1);
		System.out.println(ts1);
		
		Object[] myArray = ts1.toArray();
		System.out.println(myArray[1]);
		
		System.out.println("====================================================");
		
		List<Integer> ll = new LinkedList<Integer>();
		for(int j=0;j<a.length;j++) {
			ll.add(a[j]);
		}
		System.out.println(ll);
	
		System.out.println(ll.get(1));
		
	}

}
