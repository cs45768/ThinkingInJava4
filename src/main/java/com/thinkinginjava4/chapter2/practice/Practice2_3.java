package com.thinkinginjava4.chapter2.practice;

/*
 * 题目：找出含有ATypeName的代码段，将起改写成完整的程序，然后编译，运行。

含有ATypeName的代码段在书本25面，是以下两句代码： 
class ATypeName { Class body goes here } 
ATypeName a = new ATypeName();
*
*/
public class Practice2_3 {

		static int j;
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        ATypeName A = new Practice2_3().new ATypeName();
	    }

	   class ATypeName {
	    	int i=100000;
	    }
	    

}
