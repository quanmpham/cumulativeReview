package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	//The DIFFERENCE between ArrayList and LinkedList is in the architecture
	//INTERVIEW QUESTION:when you remove an item in arraylist every item has to shuffle up
	//if you remove an item in linked list; they are linked, each item is linked with next NODE and previous NODE
	//Each item knows whos after who; that means if i remove an item from linked list, only the pointer change
	//In an optimization sense LinkedList is more optimize than ArrayList
	public static void main(String[] args) {
		//Anything that goes inside <> have to be reference/object data type
		//Meaning not primitive(int would be Integer)(double would be Double)(char would be Character)
		//LIST: ArrayList and LinkedList
		List<String> AL = new ArrayList<String>();
		
		AL.add("AP");
		AL.add("John");
		AL.add("Jane");
		AL.add("Tom");
		AL.add("Tim");
		AL.add("Larry");
		AL.add("Levi");
		AL.add("Anki");
		//Size is not fixed. //Meaning its dynamic
		System.out.println("ArrayList Iterator:");
		Iterator alitr = AL.iterator();
		while(alitr.hasNext()) {
			System.out.print(alitr.next()+",");
		}
		System.out.println();
		System.out.println(AL);
		System.out.println(AL.get(1));
		
		AL.remove(1);
		
		System.out.println(AL);
		System.out.println(AL.size());
		
		System.out.println(AL.get(AL.size()-1));//This show you the last input
		
	
		
//		for(String item:AL) {
//			System.out.println(item);
//		}
		
		System.out.println("============================================================");
		
		List<String> LL = new LinkedList<String>();
		
		LL.add("AP");
		LL.add("John");
		LL.add("Jane");
		LL.add("Tom");
		LL.add("Tim");
		LL.add("Larry");
		LL.add("Levi");
		LL.add("Anki");
		//Size is not fixed. //Meaning its dynamic
		System.out.println("LinkedList Iterator:");
		Iterator llit = LL.iterator();
		while(llit.hasNext()) {
			System.out.print(llit.next()+",");
		}
		System.out.println();
		System.out.println(LL);
		System.out.println(LL.get(1));
		
		LL.remove(1);
		
		System.out.println(LL);
		System.out.println(LL.size());
		 
		System.out.println(LL.get(LL.size()-1));//This show you the last input
		
		


		
		
	}


}
