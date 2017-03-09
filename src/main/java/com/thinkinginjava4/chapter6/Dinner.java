package com.thinkinginjava4.chapter6;

import com.thinkinginjava4.chapter6.dessert.Cookie;

//: access/Dinner.java
// Uses the library.

public class Dinner {
  public static void main(String[] args) {
    Cookie x = new Cookie();
    //! x.bite(); // Can't access
  }
} /* Output:
Cookie constructor
*///:~
