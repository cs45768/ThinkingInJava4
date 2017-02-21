package com.thinkinginjava4.chapter4.practice;

import java.util.Random;

public class Practice3 {

	public static void main(String[] args) {
		while (true) {
			int  b=0;
			int a=0;
			for (int i = 0; i < 25; i++) {
				Random random=new Random();
				if (i==0) {
					a=random.nextInt(100);
					System.out.println((i+1)+":"+a);
				}else {
					b=random.nextInt(100);
					if (b>a) {
						System.out.println((i+1)+":"+b+">"+a);
					}else if (b<a) {
						System.out.println((i+1)+":"+b+"<"+a);
					}else if (b==a) {
						System.out.println((i+1)+":"+b+"=="+a);
					}
					a=b;
				}
			}
			
		}
		
	}

}
