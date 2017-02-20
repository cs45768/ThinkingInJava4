package com.thinkinginjava4.chapter3.practice;

public class Practice4 {

	static double distance;
	static double time;
	static double getSpeed(){
		return distance/time;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice4 practice4=new Practice4();
		practice4.distance=100d;
		practice4.time=2d;
		System.out.println(practice4.getSpeed());
	}

}
