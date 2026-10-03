package com.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo10 {

	public static void main(String[] args) {
		//<Key, Value> key = 1 null key is allowed
		HashMap<String, Object> a = new HashMap<>();
		a.put("Rollno",123);
		a.put("Name","Rama");
		a.put("Fee",123.56);
		
		System.out.println(a);
		Set<Entry<String, Object>> s = a.entrySet();
		
		
		Iterator<Entry<String, Object>> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//For-each loop
		for(Entry<String, Object> a1 : s) {
			System.out.println(a1);
		}
		
	}

}
