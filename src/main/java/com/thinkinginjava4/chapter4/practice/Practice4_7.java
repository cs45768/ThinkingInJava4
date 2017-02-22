package com.thinkinginjava4.chapter4.practice;

public class Practice4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=100; i++) {
			if (i==99) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("-----------------");
		printNum();
		
	}

	static void printNum(){
		
		for (int i = 1; i <=100; i++) {
			if (i==99) {
				return;
			}
			System.out.println(i);
		}
	}
}
