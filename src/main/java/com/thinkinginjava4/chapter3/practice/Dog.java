package com.thinkinginjava4.chapter3.practice;

public class Dog {
	public String name;
	
	public String says;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		dog1.name="spot";
		dog1.says="Ruff!";
		Dog dog2=new Dog();
		dog2.name="scruffy";
		dog2.says="Wurf!";
		System.out.println(dog1.name+"--"+dog1.says);
		System.out.println(dog2.name+"--"+dog2.says);
	
		Dog dog3=new Dog();
		dog3=dog1;
		System.out.println(dog1==dog3);
		System.out.println(dog1.equals(dog3));
	
	}

}
