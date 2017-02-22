package com.thinkinginjava4.chapter4.practice;

public class Practice4_6 {

	static int test(int testval,int begin,int end){
		if (begin>end) {
			System.out.println("begin值不能 大于end值");
			return 0;
		}
		if (testval>=begin&& testval<=end) {
			return  +1;
		}else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(test(1,2, 3));
		System.out.println(test(1,-1, 3));
		System.out.println(test(1,11, 3));
	}
	

}
