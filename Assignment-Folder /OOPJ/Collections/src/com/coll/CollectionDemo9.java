package com.coll;

import java.util.HashSet;
import java.util.Set;

public class CollectionDemo9 {

	public static void main(String[] args) {
		//does not allow duplicates and does not follow the order of insertion
		Set a = new HashSet();
		a.add(123);
		a.add("Rama");
		a.add(1234.678);
		a.add("Rama");
		
		System.out.println(a);
	}

}
