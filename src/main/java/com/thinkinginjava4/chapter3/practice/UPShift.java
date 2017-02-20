package com.thinkinginjava4.chapter3.practice;

public class UPShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-2;
		System.out.println(Integer.toBinaryString(i));
		i>>>=1;
		System.out.println(Integer.toBinaryString(i));
	
		
		short s=-1;
		System.out.println(Integer.toBinaryString(s));
		s>>>=2;
		System.out.println(Integer.toBinaryString(s>>>10));
	
	
	
	}

}
