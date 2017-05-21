package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;


class Art {
	  Art() { print("Art constructor"); }
	}

class Drawing extends Art {
	  Drawing() { print("Drawing constructor"); }
	}

class Cartoon extends Drawing {
	  public Cartoon() { print("Cartoon constructor"); }
	 
	}
	
public class Practice7_3 extends Cartoon {
	
	 public static void main(String[] args) {
		 Practice7_3 x = new Practice7_3();
	 }
}
