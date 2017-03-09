package com.thinkinginjava4.chapter5.practice;


class Cup{
	Cup(int marker){
		System.out.println("Cup("+marker+")");
	}
	void f(int marker){
		System.out.println("f("+marker+")");
	}
}

class Cups{
	
	static{
		cup1=new Cup(1);
		cup2=new Cup(2);
	}
	static Cup cup1;
	static Cup cup2;
	Cups(){
		System.out.println("Cups");
	}
}

public class Practice5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new  Cups();
		Cups.cup2.f(95);
	}

}
