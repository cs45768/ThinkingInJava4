package com.thinkinginjava4.chapter6;

public class PrivateTest1 extends privateTest{

	public void name() {
		System.out.println(this.getId());
		System.out.println(name);
		System.out.println(address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrivateTest1().name();
	}

}
