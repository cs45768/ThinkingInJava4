package com.thinkinginjava4.chapter5.practice;

public class Test {

	static void testF(String payBalance ){
		String string=Math.round(Double.valueOf(payBalance)*100)+"";
		System.out.println(string);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testF("10.07");
	}

}
