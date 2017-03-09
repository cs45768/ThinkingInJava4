package com.thinkinginjava4.chapter5.practice;

import sun.org.mozilla.javascript.internal.ObjArray;


public class Practice5_19 {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args=new String[]{"111","222","333"};
		printStrings(args);
		printStrings1(args);
	}

}
