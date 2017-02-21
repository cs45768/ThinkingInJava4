package com.thinkinginjava4.chapter4.practice;

public class Practice5 {

	static int i=0X16;
	static int j=0X17;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		System.out.println((i^j));
		System.out.println(Integer.toBinaryString(~i));
		System.out.println(Integer.toBinaryString(i^j));
		
		 short b = 31;
	     int i = b >>2;
	     System.out.println(i);
	}

}
