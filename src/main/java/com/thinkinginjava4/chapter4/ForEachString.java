package com.thinkinginjava4.chapter4;

//: control/ForEachString.java

public class ForEachString {
  public static void main(String[] args) {
    for(char c : "An African Swallow".toCharArray() )
      System.out.print(c + " ");
    System.out.println();
    for (char c:"asdfghjklkjhgfdsww3erted".toCharArray()) {
		System.out.print(c+"--");
	}
    
  }
} /* Output:
A n   A f r i c a n   S w a l l o w
*///:~
