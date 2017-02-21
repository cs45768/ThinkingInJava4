package com.thinkinginjava4.chapter3.practice;

public class Practice10 {

	static int i= 0xAAAA;
	static int j=0x5555;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(~i));
		System.out.println(Integer.toBinaryString(i^j));
		
		 short b = 31;
	     int i = b >>2;
	}

}
