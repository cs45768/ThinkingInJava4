package com.thinkinginjava4.chapter6;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

//: access/QualifiedMyClass.java

public class QualifiedMyClass {
  public static void main(String[] args) {
   com.thinkinginjava4.chapter6.mypackage.MyClass m =
      new com.thinkinginjava4.chapter6.mypackage.MyClass();
  }
} ///:~
