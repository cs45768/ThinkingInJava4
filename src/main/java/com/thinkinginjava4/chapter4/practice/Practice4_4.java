package com.thinkinginjava4.chapter4.practice;

public class Practice4_4 {

	static void testPrime(int number){
		if (number<2) {
			System.out.println(number+"不是素数");
		}
		int t=0;
		for (int i = 1; i <=number; i++) {
		}
	}
	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) {
			int count=0;
			for (int j = 1; j < i; j++) {
				/*if (i%j==0) {
					count++;
				}*/
				count=(i%j==0?++count:count);
			}
			if (count<2) {
				System.out.println("素数："+i);
			}
		}
	
	}

}
