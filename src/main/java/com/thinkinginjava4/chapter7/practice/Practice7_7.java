package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;


class AA{
	  AA(int i) { print("A constructor "+i); }
	}

class BB{
	  BB(int i) { print("B constructor "+i); }
}

class CC extends AA{
	
	 CC() {
		 super(123);
	 	}

	public BB b=new BB(123);
	  //public C() { print("C constructor"); }
	 
}
	
public class Practice7_7 extends Cartoon {
	
	 public static void main(String[] args) {
		 CC c = new CC();
	 }
}
