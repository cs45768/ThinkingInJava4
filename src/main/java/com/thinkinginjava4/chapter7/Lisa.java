package com.thinkinginjava4.chapter7;

//: reusing/Lisa.java
// {CompileTimeError} (Won't compile)

class Lisa extends Homer {
  @Override void doh(Milhouse m) {
    System.out.println("doh(Milhouse)");
  }
} ///:~
