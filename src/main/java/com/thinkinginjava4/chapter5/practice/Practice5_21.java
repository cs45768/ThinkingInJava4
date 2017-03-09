package com.thinkinginjava4.chapter5.practice;

public class Practice5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Money e : Money.values()) {
			System.out.println(e+"-----"+e.ordinal());
		}
		
	}
}

enum Money {
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY;
}
