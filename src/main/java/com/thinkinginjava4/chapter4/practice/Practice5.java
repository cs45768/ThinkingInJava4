package com.thinkinginjava4.chapter4.practice;

public class Practice5 {

	static int i=0X16;
	static int j=0X17;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 0xAAAA;
	        int b = 0x5555;
	        int c;
	        c = a & b;
	        outCBit(c);
	        c = a | b;
	        outCBit(c);
	        c = ~a;
	        outCBit(c);
	        c = a ^ b;
	        outCBit(c);
		
	}
	
	 private static void outCBit(int c) {
	        int d = 0x8000;
	        for (int i = 0; i < 16; i++) {
	            int out = (c | d) == c ? 1 : 0;//循环比较得出每一位
	            System.out.print(out);
	            d>>>=1;
	        }
	        System.out.println();
	    }

}
