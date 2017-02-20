package com.thinkinginjava4.chapter3.practice;

import java.util.Date;

public class Test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello it's");
		System.out.println(new Date());
		
		int a=8;
		int b=9;
		int x=-a;
		int y=a*-b;
		System.out.println(x);
		System.out.println(y);
		
		Integer n1=new Integer(47);
		Integer n2=new Integer(47);
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
	}

}
