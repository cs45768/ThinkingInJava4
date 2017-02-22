package com.thinkinginjava4.chapter4.practice;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.Random;

import com.sun.org.glassfish.external.statistics.Statistic;
/*
 * 吸血鬼数字
 * 1260=21*60
 * */
public class Practice4_10 {
	  static int sum=0;//记录调用判断的次数,TMJG添加此行并注释  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sum1=0,sum2=0;
			System.out.println(1201%100);
			for (int i = 1000; i < 2000; i++) {
				if (i%100==0) {
					continue;
				}
				char[] c=(i+"").toCharArray();
				for (int j = 0; j <c.length ; j++) {
					System.out.print(c[j]+" ");
				}
				System.out.println();
			}
			
		}
		
	  // control/VampireNumbers.java  
    // TIJ4 Chapter Control, Exercise 10, page 154  
    /* A vampire number has an even number of digits and is formed by multiplying a 
    * pair of numbers containing half the number of digits of the result. The 
    * digits are taken from the original number in any order. Pairs of trailing 
    * zeroes are not allowed. Examples include: 1260 = 21 * 60, 1827 = 21 * 87, 
    * 2187 = 27  * 81. Write a program that finds all the 4-digit vampire numbers. 
    * (Suggested by Dan Forhan.) 
    */   
//  本方法是顺向思维，即先有四位数，再拆分，四个数字组合相乘，若乘积与原数相等，则输出，并计算为一个吸血鬼数字。TMJG添加此行并注释  
//  其实sum的结果为107976次，非常大，算法效率很低，并且出现了重复（6880 = 86 * 80，6880 = 80 * 86）。TMJG添加此行并注释  
      
    /*        static int sum=0;//记录调用判断的次数,TMJG添加此行并注释  
            static int a(int i) {  
                return i/1000;    //求千位数字，下同,TMJG添加此行并注释  
            }  
            static int b(int i) {  
                return (i%1000)/100;  
            }  
            static int c(int i) {  
                return ((i%1000)%100)/10;  
            }  
            static int d(int i) {  
                return ((i%1000)%100)%10;  
            }  
            static int com(int i, int j) {   //形成10~99的两位数,TMJG添加此行并注释  
                return (i * 10) + j;  
            }  
            static void productTest (int i, int m, int n) {  
                sum++;  
                if(m * n == i) System.out.println(i + " = " + m + " * " + n);  
            }     
        public static void main(String[] args) {          
            for(int i = 1001; i < 9999; i++) {             
                productTest(i, com(a(i), b(i)), com(c(i), d(i)));  
                productTest(i, com(a(i), b(i)), com(d(i), c(i)));  
                productTest(i, com(a(i), c(i)), com(b(i), d(i)));  
                productTest(i, com(a(i), c(i)), com(d(i), b(i)));  
                productTest(i, com(a(i), d(i)), com(b(i), c(i)));  
                productTest(i, com(a(i), d(i)), com(c(i), b(i)));  
                productTest(i, com(b(i), a(i)), com(c(i), d(i)));  
                productTest(i, com(b(i), a(i)), com(d(i), c(i)));  
                productTest(i, com(b(i), c(i)), com(d(i), a(i)));  
                productTest(i, com(b(i), d(i)), com(c(i), a(i)));  
                productTest(i, com(c(i), a(i)), com(d(i), b(i)));  
                productTest(i, com(c(i), b(i)), com(d(i), a(i)));  
            }     
            System.out.println("总共调用判断的次数为："+sum);//TMJG添加此行并注释  
        } 
		*/

}
