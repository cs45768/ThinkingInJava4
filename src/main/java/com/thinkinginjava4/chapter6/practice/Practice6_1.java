package com.thinkinginjava4.chapter6.practice;

import java.util.*;

import com.thinkinginjava4.chapter6.*;
import com.thinkinginjava4.chapter6.Vector;

/*
 * 练习（1）：在某个包中创建一个类，在这个类所处的包外部创建该类的实例。
 * 
 *  */
public class Practice6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vvv=new Vector();
		System.out.println(vvv.toString());
		
		P6_1 p=new  P6_1("hhhhhhhhhhhhhh");
		System.out.println(p.getName());
	}

}
