package com.thinkinginjava4.chapter2;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass s1 = new StaticClass();
		StaticClass s2 = new StaticClass();
		StaticClass.i++;
		System.out.println(s1.i);
		System.out.println(s1.i == s2.i);
		System.out.println(s1.j == s2.j);
		String[] strings = null;
		System.out.println(strings);
		
	}

}