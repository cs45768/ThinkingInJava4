package com.thinkinginjava4.chapter5.practice;

/*练习（17）：创建一个类，它有一个接受一个String参数的构造器，在构造阶段，打印该参数。创建一个该类的对象引用数组，但是不实际去创建对象赋值给该数组。当运行程序时，请注意来自对该构造器的调用中的初始化消息是否打印了出来。 
这个看完题目就知道不会打印，对象都没有创建肯定不会调用构造函数。*/
public class Practice5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test17[] test17s = new test17[5];
	}

}

class test17{
    public test17(String str){
        System.out.println(str);
    }
}
