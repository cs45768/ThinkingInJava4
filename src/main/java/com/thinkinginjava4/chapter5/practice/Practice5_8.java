package com.thinkinginjava4.chapter5.practice;

public class Practice5_8 {

	 void f1(){
		System.out.println("f1f1f1f1f");
		f2(new Practice5_8());
		f2(this);
	}
	
	void f2(Practice5_8 p){
		System.out.println("f2f2f2f2");
	}
	
	public static void main(String[] args) {
		new Practice5_8().f1();
	}

}
