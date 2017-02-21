package com.thinkinginjava4.chapter3.practice;
/*
 * 
 * 编写一个方法，它依二进制形式显示char类型的是值。*/
public class Practice13 {

	static String getBinaryByChar(char c){
		System.out.println(c);
		return Integer.toBinaryString(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='我';
		System.out.println(getBinaryByChar(c));
		char c1='d';
		System.out.println(getBinaryByChar(c1));
	}

}
