package com.thinkinginjava4.chapter5.practice;

import sun.org.mozilla.javascript.internal.ObjArray;


public class Practice5_20 {

	static void printStrings(String[] strings){
		for (String string:strings) {
			System.out.println(string);
		}
	}
	static void printStrings1(String... strings){
		for (String string:strings) {
			System.out.println(string);
		}
	}
	
	public static void main(String... args1) {
		// TODO Auto-generated method stub
		printStrings(args1);
		printStrings1(args1);
	}

}
