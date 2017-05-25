//: annotations/ExtractInterface.java
// APT-based annotation processing.
package com.thinkinginjava4.chapter20;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
  public String value();
} ///:~
