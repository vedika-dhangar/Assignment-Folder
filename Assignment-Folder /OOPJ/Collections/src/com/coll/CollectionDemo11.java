package com.coll;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo11 {

	public static void main(String[] args) {
		//sorts the elements in ascending order
		Set a = new TreeSet();
		a.add(123);
		a.add(111);
		a.add(123);
		a.add(456);
		a.add(56);
		
		System.out.println(a);
	}

}
