package com.thinkinginjava4.chapter6.practice;

public class Testdebug {
	protected int num=100;
	public static void debugoff(String[] str){
        for (String str1 :
                str) {
            System.out.print(str1);
        }
    }
    
    protected void f(){
        int i = 20;
        System.out.println("debug testdebug protected is fangwengdao" + i);
    }

    public void mathodpublic(){
        int i = 5;
        System.out.println("public is fangwengdao" + i);
    }

    private void methodprivate(){
        int i = 10;
        System.out.println("private is fangwengdao" + 10);
    }
}
