package com.thinkinginjava4.chapter3.practice;

public class Practice10 {

	static int i=0X16;
	static int j=0X17;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		System.out.println((i^j));
		System.out.println(Integer.toBinaryString(~i));
		System.out.println(Integer.toBinaryString(i^j));
	}

}