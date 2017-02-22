package com.thinkinginjava4.chapter4.practice;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.Random;

public class Practice4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			switch (i) {
			case 20:
				System.out.println("打印1："+i);
			case 50:
				System.out.println("打印2："+i);
				break;
			case 70:
				System.out.println("打印3："+i);
			default:
				System.out.println("打印默认----："+i);
				break;
			}
			
			
			
		}
		
		/*Random rand = new Random(47);
	    for(int i = 0; i < 100; i++) {
	      int c = rand.nextInt(26) + 'a';
	      printnb((char)c + ", " + c + ": ");
	      switch(c) {
	        case 'a':
	        case 'e':
	        case 'i':
	        case 'o':
	        case 'u': print("vowel");
	        case 'y':
	        case 'w': print("Sometimes a vowel");
	        default:  print("consonant");
	      }
	    }*/
		
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
