package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;
class Component1 {
	Component1(int i){
        System.out.println(i+" Component1");
    }
}
class Component2 {
	Component2(int i){
        System.out.println(i+" Component2");
    }
}
class Component3 {
	Component3(int i){
        System.out.println(i+" Component3");
    }
}

class Root{
	 Component1 component1;
	    Component2 component2;
	    Component3 component3;
	    public Root(int i){
	        component1 = new Component1(1);
	        component2 = new Component2(2);
	        component3 = new Component3(3);
	        System.out.println(i + "Root is created");
	    }
}

class Steam extends Root{

	public Steam(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
}

public class Practice7_10{

	public static void main(String[] args) {
		   Steam steam=new Steam(1);
		   Root root=new Root(22);
	 }
}
