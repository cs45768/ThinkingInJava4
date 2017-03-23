package com.thinkinginjava4.chapter6.practice;

import com.thinkinginjava4.chapter6.practice.debugoff.Practice;
/*
（好吧，我是服了翻译了）英文原版原文如下: 
这里写图片描述
像我这种勉强刚过4级的人都知道，这个题应该这样翻： 
在同一个文件下创建第二个类，该类拥有一个能操作第一个类中protected数据的方法。 

*/
public class Practice6_6 {

	Testdebug testdebug = new Testdebug();
	public void f(){
        testdebug.num ++;
        System.out.println(testdebug.num);
    }
	
	public static void main(String[] args) {
		
 	new	Practice6_6().f();
	}
	
}