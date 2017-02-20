package com.thinkinginjava4.chapter2.practice;

public class DataOnly {
	public static  String f(){
		System.out.println(DataOnly.class.getName());
		return DataOnly.class.getName();
	}
	
	public static void main(String[]  args){
		System.out.println(f());
		System.out.println(args.length);
	}
}
