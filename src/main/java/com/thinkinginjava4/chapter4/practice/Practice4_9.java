package com.thinkinginjava4.chapter4.practice;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.Random;

import com.sun.org.glassfish.external.statistics.Statistic;

public class Practice4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci(1000000000);
			
			
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
		

	static void fibonacci(int num){
		if (num<1) {
			System.out.println("请输入大于或等于1的数。");
		}
			int begin=0;
			int next=1;
			int middle=0;
			System.out.print(1+" ");
			for (int j =1; j <=num; j++) {
				middle=begin+next;
				if (middle<=num) {
					begin =next;
					next=middle;
					System.out.print(middle+" ");
				}else {
					break;
				}
			}
		
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
