package com.coll;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo12 {

	public static void main(String[] args) {
		//<Key, Value> key = 1 null key is allowed
		HashMap<String, Object> a = new HashMap();
		a.put("Rollno",123);
		a.put("Name","Rama");
		a.put("Fee",123.56);
		a.put(" ",123.11);
		a.put("   ",1111.11);
		a.put("Rollno",555);
		a.put("   ",123);
		a.put("Name1"," ");
		a.put("Name2"," ");
		a.put("Name3"," ");
	
		System.out.println(a);
		
		Object obj = a.get("Fee");
		System.out.println(obj);
		
		Set<String> keys = a.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
