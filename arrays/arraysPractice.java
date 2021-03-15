package arrays;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class arraysPractice {

	public static void main(String[] args) {

		// Interview question: What does SPLIT do, how do you use SPLIT
//		String areaCode = "123,564,979,646,316,316,164";
//		String[] areaCodeArray = areaCode.split(",");// could be split by space (" ")
//		System.out.println(areaCodeArray[0]);
//		System.out.println(areaCodeArray.length);
//		
//		
//		String name = "Quan,Van,Linh,Khoa,Vy";
//		String[] names = name.split(",");
//		System.out.println(names[0]);
//		for(String i: names) {
//			System.out.println(i);
//		}
		
		int[] a = {2,3,1,4,5,6,7,5,7,8,19};
		Set<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i<a.length;i++) {
			ts.add(a[i]);
		}
		System.out.println(ts);
		

	}

}
