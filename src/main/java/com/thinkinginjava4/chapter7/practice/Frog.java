package com.thinkinginjava4.chapter7.practice;

public class Frog extends Amphibian {

	public void fly(Amphibian a){
		System.out.println("Frog fly");
	}
	
	public void flyFlog(Amphibian a){
		System.out.println("Frog fly1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog=new Frog();
		frog.fly(frog);
		frog.flyyy(frog);
		frog.flyFlog(frog);
	}

}
