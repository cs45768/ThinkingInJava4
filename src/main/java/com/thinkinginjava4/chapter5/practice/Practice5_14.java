package com.thinkinginjava4.chapter5.practice;

class StaticTest{
	static String  s1;
	static{
		String s2="s2";
		System.out.println("s2:"+s2);
	}
	public StaticTest(String  s1) {
		this.s1=s1;
		System.out.println("s1:"+s1);
		// TODO Auto-generated constructor stub
	}
	void printStr(String s1){
		this.s1=s1;
		System.out.println("s1:"+s1);
	}
}
public class Practice5_14 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest staticTest=new StaticTest("ssssssssssss1");
		staticTest.printStr("s--1");
	}

}
