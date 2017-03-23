package com.thinkinginjava4.chapter6.practice;

import com.thinkinginjava4.chapter6.practice.debugoff.Practice;
/*展示protected具有包访问权限，而不是public。 */
public class Practice6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice  p   =new Practice();
		p.debug();
		
		P6.testProtect();
		
		
		
		//pp.testProtect();
	}

	
	protected static void testProtect() {
		System.out.println("hahahah--------");
	}
}

class P6{
	
	protected static void testProtect() {
		System.out.println("hahahah--------");
	}
}
