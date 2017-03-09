package com.thinkinginjava4.chapter6;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class privateTest {

	private String id="001";
	protected String name="zch";
    String address="zj";
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new privateTest().id);
		System.out.println(new privateTest().name);
		String  string=new String("111111111111111");
		System.out.println(string);
	}

}
