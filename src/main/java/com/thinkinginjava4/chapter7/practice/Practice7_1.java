package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;

/*
练习（1）：创建一个简单的类。在第二个类中，将一个引用定义为第一个类的对象。运用惰性初始化来实例化这个对象。 
编译器不会给每个引用默认创建对象，因为这样会造成资源的浪费。想要初始化引用，必须按这种格式：类型 类名 = new 类型； 
初始化引用可以在一下4种位置上进行： 
1，在定义对象的地方。就是我们在新创建一个引用时直接在后面创建对象。我们知道编译器加载Java文件时先加载各种静态成员，再加载成员变量，再加载方法，所以这时引用初始化先于构造器被调用。这时如果我们的引用指向的对象的构造器中有什么方法的话，也会优先于当前对象（实例化后）的构造方法运行。 
2，在构造器中初始化。 
3，在要使用到时初始化。 
4，使用实例初始化。（关于实例初始化的解释） 
http://www.programcreek.com/2011/10/java-class-instance-initializers/ 
http://www.open-open.com/solution/view/1409534328385

而方法3就是练习中所说的惰性初始化。这个方法保证了在需要时才生成对象，同1，2方法相比，减少了额外的负担。*/
public class Practice7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bath b = new Bath();
	   b.cook();
	}

}

class Bath{

    {
        Soap soap5 = new Soap("实例初始化2");
    }
    Soap soap1 = new Soap("在定义对象的地方初始化");//在定义对象的地方之间初始化
    Soap soap2;
    Soap soap3;
    public Bath(){
        soap2 = new Soap("在构造器中初始化");
    }

    public void cook(){
        soap3 = new Soap("惰性初始化");
    }

    {
        Soap soap4 = new Soap("实例初始化");
    }
}

class Soap{
    private String name;
    public Soap(String str){
        name = str;
        System.out.println("name :" + name);
    }
}