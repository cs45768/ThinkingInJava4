package com.thinkinginjava4.chapter5.practice;

/*练习（18）：通过创建对象赋值给引用数组，从而完成前一个练习。*/
public class Practice5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test18[] test18s=new test18[5];
		test18s[0] =new test18("h");
		test18s[1] =new test18("2");
		test18s[2] =new test18("l");
		test18s[3] =new test18("l");
		test18s[4] =new test18("o");
		System.out.println(test18s.toString());
		
	}

}

class test18{
    public test18(String str){
        System.out.println(str);
    }
}
