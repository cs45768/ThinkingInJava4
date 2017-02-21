package com.thinkinginjava4.chapter3.practice;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-123456;

		
		for (int i = 0; i <=32; i++) {
			
			System.out.println("i="+i+":"+(num<<i)+"---"+Integer.toBinaryString(num<<i));
		}
		System.out.println("----------------------");
		for (int i = 1; i <=32; i++) {
			
			System.out.println("i="+i+":"+(num>>i)+"---"+Integer.toBinaryString(num>>i));
		}
	}

}
