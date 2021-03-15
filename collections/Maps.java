package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		//MAPS: Key, Value
		//3 Types of MAPS: HashMap, LinkedHashMap, TreeMap
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		
		//Everything will come out randomly
		
		hm.put(3, "Apple");
		hm.put(44, "Bread");
		hm.put(686, "Carrot");
		hm.put(5, "John");
		hm.put(88, "Larry");
		hm.put(96, "Anki");
		hm.put(99, "Test");
		hm.put(6, "Bread");
		System.out.println(hm.get(99));
		hm.put(99, "Hello");
		//Same key cannot have two values, it will only remember the latest one
		System.out.println(hm);
		System.out.println(hm.get(99));
		//You can have multiple of the same value
		System.out.println("==================================================");
		
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(3, "Apple");
		lhm.put(44, "Bread");
		lhm.put(686, "Carrot");
		lhm.put(5, "John");
		lhm.put(88, "Larry");
		lhm.put(96, "Anki");
		lhm.put(99, "Test");
		lhm.put(6, "Bread");
		System.out.println(lhm.get(99));
		lhm.put(99, "Hello");
		
		System.out.println(lhm);// will print the same order as we listed
		System.out.println(lhm.get(99));
		System.out.println("==========================================================");
		
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Apple");
		tm.put(44, "Bread");
		tm.put(686, "Carrot");
		tm.put(5, "John");
		tm.put(88, "Larry");
		tm.put(96, "Anki");
		tm.put(99, "Test");
		tm.put(6, "Bread");
		System.out.println(tm.get(99));
		tm.put(99, "Hello");
		//will be in chronological order but based on the KEYS
		System.out.println(tm);
		System.out.println(tm.get(99));
		
		//QUESTION: Which is more optimize/fastest: HashMap would be the fastest; TreeMap 
		//would be the slowest because first they have to go over each item and organize each
	}

}
