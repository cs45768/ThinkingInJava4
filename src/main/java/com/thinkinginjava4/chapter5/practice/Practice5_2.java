package com.thinkinginjava4.chapter5.practice;

public class Practice5_2 {

	static String string ;
	Practice5_2(String s){
		if (s==string) {
			System.out.println("两个相等");
		}
		if (s.equals(string)) {
			System.out.println("两个equel");
		}
		System.out.println("默认String值："+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(string);
			
			new Practice5_2(string);
	}

}
