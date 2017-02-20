package com.thinkinginjava4.chapter3.practice;

import java.util.Random;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int i=random.nextInt();
		System.out.println(i);
		if (i%2==0) {
			System.out.println("正面");
		}else{
			System.out.println("反面");
		}
			
			
	}

}
