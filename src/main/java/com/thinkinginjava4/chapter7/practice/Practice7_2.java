package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;

public class Practice7_2 extends Detergent{

	  public void scrub() {
		    append(" Practice7_2.scrub()");
		    super.scrub(); // Call base-class version
	}
	  
	  public void sterilize() {
		    System.out.println("sterilize()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice7_2 practice7_2=new Practice7_2();
		practice7_2.scrub();
		System.out.println(practice7_2.toString());
		Cleanser.main(args);
		Detergent.main(args);
	}

}


class Cleanser {
	  private String s = "Cleanser";
	  public void append(String a) { s += a; }
	  public void dilute() { append(" dilute()"); }
	  public void apply() { append(" apply()"); }
	  public void scrub() { append(" scrub()"); }
	  public String toString() { return s; }
	  public static void main(String[] args) {
	    Cleanser x = new Cleanser();
	    x.dilute(); x.apply(); x.scrub();
	    print(x);
	  }
	}	

 class Detergent extends Cleanser {
	  // Change a method:
	  public void scrub() {
	    append(" Detergent.scrub()");
	    super.scrub(); // Call base-class version
	  }
	  // Add methods to the interface:
	  public void foam() { append(" foam()"); }
	  // Test the new class:
	  public static void main(String[] args) {
	    Detergent x = new Detergent();
	    x.dilute();
	    x.apply();
	    x.scrub();
	    x.foam();
	    print(x);
	    print("Testing base class:");
	    Cleanser.main(args);
	  }	
	} 