package com.sample;

import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		String arr[]= {"aaa","bbb","ccc","ddd","eee"};
		System.out.println(Arrays.toString(arr));
		Demo2 demo = new Demo2();
		
		demo.id=01;
		demo.name="sam";
		demo.age=10;
		System.out.println(demo.toString());
		System.out.println(arr instanceof Object);
		
//		String str="Hello";
//		String str1="Hello";
//		String str2="hello";
//		String str3=new String("Hello");
//		
//		String str5="Hello"+"bye"+"Hello"+"bye";
//		String str6="HelloByeHelloBye";
//		System.out.println(str==str1);
//		System.out.println(str==str2);
//		System.out.println(str5==str6);
//		System.out.println(str5.equals(str6));//false
//		System.out.println(str.equalsIgnoreCase(str2));//true
//		System.out.println(str);
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str5);
//		StringBuffer buffer=new StringBuffer("Hello");
//		buffer.append(str6);
//		System.out.println(buffer.toString());
		
		
	}

}
