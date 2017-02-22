package com.thinkinginjava4.chapter2.practice;

import com.sun.org.apache.bcel.internal.generic.NEW;

/*
 * 题目：找出含有ATypeName的代码段，将起改写成完整的程序，然后编译，运行。

含有ATypeName的代码段在书本25面，是以下两句代码： 
class ATypeName { Class body goes here } 
ATypeName a = new ATypeName();
*
*/
public class Practice2_4 {

		public static void main(String[] args) {
			DataOnly dataOnly = new DataOnly();
	        dataOnly.i = 47;
	        dataOnly.d = 1.1;
	        dataOnly.b = false;	    
	        System.out.println(dataOnly.i);
	        System.out.println(new DataOnly().f());
	    }
	    

}
