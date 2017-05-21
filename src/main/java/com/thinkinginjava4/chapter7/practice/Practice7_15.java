package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;

import com.thinkinginjava4.chapter6.privateTest;


	
public class Practice7_15{

	private Cleanser cleanser=new Cleanser();
	
	  public void dilute() { 
		  cleanser.dilute(); 
	  }
	  public void apply() {  cleanser.apply(); }
	  public void scrub() {  cleanser.scrub();}
	
	  protected void haha() {  System.out.println("Test Protect");}
	
	
	public static void main(String[] args) {
		Practice7_15 practice7_11=new Practice7_15();
		practice7_11.haha();
	 }
}
