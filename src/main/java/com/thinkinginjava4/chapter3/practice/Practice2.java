package com.thinkinginjava4.chapter3.practice;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank=new Tank();
		Tank tank2=new Tank();
		System.out.println(tank==tank2);
		tank.a=2f;
		tank2.a=3f;
		System.out.println(tank==tank2);
		System.out.println(tank.equals(tank2));
		System.out.println("tank.a:"+tank.a+" tank2.a:"+tank2.a);
		tank2=tank;
		tank.a=100f;
		System.out.println(tank==tank2);
		System.out.println(tank.equals(tank2));
		System.out.println("tank.a:"+tank.a+" tank2.a:"+tank2.a);
		
		
	}

}
