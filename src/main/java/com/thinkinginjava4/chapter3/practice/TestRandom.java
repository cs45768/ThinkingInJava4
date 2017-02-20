package com.thinkinginjava4.chapter3.practice;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 案例2
        // 对于种子相同的Random对象，生成的随机数序列是一样的。
		  for (int i1 = 0; i1 < 10; i1++) {
	        
	        Random ran1 = new Random();
	        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: ");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(ran1.nextInt(10) + " ");
	        }
		  }
	}

}
