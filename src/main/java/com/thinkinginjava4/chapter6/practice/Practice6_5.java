package com.thinkinginjava4.chapter6.practice;

import com.thinkinginjava4.chapter6.practice.debugoff.Practice;
/*
 * 创建一个带有public,private,protected和包访问权限域以及方法成员的类。
 * 创建该类的一个对象，看看在你视图调用所有类成员时，会得到什么类型的编译信息。
 * 请注意，处于用一个目录中的所有类都是默认包的一部分。 
*/
public class Practice6_5 {

	public String s1;
	protected String s2;
	String s3;
	private String s4;
	
	public void getS1(){
		System.out.println("s1:"+s1);
	}
	
	protected void getS2(){
		System.out.println("s2:"+s2);
	}
	
	void getS3(){
		System.out.println("s3:"+s3);
	}
	
	private void getS4(){
		System.out.println("s4:"+s4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6_5 p=new Practice6_5();
		p.s1="sssssssssssssssss1";
		p.getS1();
		p.getS4();
		//pp.testProtect();
	}

	
	protected static void testProtect() {
		System.out.println("hahahah--------");
	}
}

