package com.thinkinginjava4.chapter6.practice;


public class P6_1 {

	 public String name;

	    public P6_1(String str){
	        name = str;
	    }
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	protected static void testProtect() {
		System.out.println("hahahah--------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6_5 p=new Practice6_5();
		p.s1="sssssssssssssssss1";
		p.getS1();
		//pp.testProtect();
	}

}
