package com.thinkinginjava4.chapter2.practice;
/*
 * 题目：创建一个类，它包含一个int域和一个char域，
 * 它们都没有被初始化，将它们的值打印出来，以验证Java执行了默认初始化。
*/
public class Practice2_1 {
	private static  int i;
	private  static char c;
	
	private  static byte b;
	private  static short s;
	private  static long l;
	private  static float f;
	private  static double d;
	private  static boolean bl;
		
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(c);
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
		System.out.println("char的大小："+Character.SIZE+" char的默认值："+c+" char的数据范围："+Character.MIN_VALUE+"~"+Character.MAX_VALUE);  
	}
}
