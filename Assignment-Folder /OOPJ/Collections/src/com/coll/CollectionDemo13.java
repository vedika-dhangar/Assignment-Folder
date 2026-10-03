package com.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo13 {

	public static void main(String[] args) {
		//<Key, Value> key = 1 null key is allowed
		HashMap<String, Object> a = new HashMap<>();
		a.put("Rollno",123);
		a.put("Name","Rama");
		a.put("Fee",123.56);
		
		System.out.println(a);
		Collection<Object> col = a.values();
			
		
		Iterator<Object> it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
