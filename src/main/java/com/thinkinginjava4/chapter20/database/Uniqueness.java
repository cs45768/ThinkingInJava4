//: annotations/database/Uniqueness.java
// Sample of nested annotations
package com.thinkinginjava4.chapter20.database;

public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
