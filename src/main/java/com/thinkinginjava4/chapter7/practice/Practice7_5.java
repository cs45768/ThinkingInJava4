package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;


class A{
	  A() { print("A constructor"); }
	}

class B{
	  B() { print("B constructor"); }
}

class C extends A{
	
	 public B b=new B();
	  //public C() { print("C constructor"); }
	 
}
	
public class Practice7_5 extends Cartoon {
	
	 public static void main(String[] args) {
		 C c = new C();
		 System.out.println(c.b);
	 }
}
