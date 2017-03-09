package com.thinkinginjava4.chapter5.practice;

public class Dog {

	
	public static void bark(){
		System.out.println("-sssssssssss-");
	}
	
	public static  void bark(String s){
		System.out.println("barking:"+s);
	}
	
	public  static void bark(int i){
		System.out.println("howling:"+i);
	}
	
	public static  void bark(char c){
		System.out.println("cing:"+c);
	}
	
	public  static void bark(int i,String s){
		System.out.println("howlingssss:"+i);
	}
	
	public  static void bark(String s,int i){
		System.out.println("howlingaaaa:"+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bark();
		String  string="bb";
		bark(string);
		int i=0;
		bark(i);
		char c='d';
		bark(i,string);
		
		bark(c);
	}

}
