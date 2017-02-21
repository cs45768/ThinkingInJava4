package com.thinkinginjava4.chapter3.practice;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1=-1999992;
		
		int i2=0x1;
		for (int i = 1; i <=32; i++) {
			
			System.out.println((i1>>i)+"---"+Integer.toBinaryString(i1>>i));
		}
		
		for (int i = 1; i <=64; i++) {
			
			System.out.println((i2<<i)+"---"+Integer.toBinaryString(i2<<i));
		}
	}

}
