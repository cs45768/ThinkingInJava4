package com.thinkinginjava4.chapter7.practice;

import static net.mindview.util.Print.print;
/*
练习（8）：创建一个基类，它仅有一个非默认的构造器；再创建一个导出类，它带有默认构造器和非默认构造器。
在导出类的构造器中调用基类的构造器。 
非默认的构造器就是带参数的构造器。
一般当你创建一个类并且没有给其写任何构造器时，java就会默认给其创建一个构造器。
该构造器里面不做任何事。如果你自己写了一个无参构造器，也就相当于覆盖了java给其添加的默认构造器。
当然如果你写了一个带参构造器后，java也不会给其添加无参构造器。
该类此时只有你写的那个带参构造器。 
*/
class LearnigEnglish {
    LearnigEnglish(String name){
        System.out.println(name + " are learning english");
        System.out.println(name + " finished learning english and passed CET_4");
    }
}

class LearningJava extends LearnigEnglish{
    public LearningJava(){
        super("name");
    }
    public LearningJava(String name){
        super(name);
        System.out.println(name + " are learning java");
        System.out.println(name + " can make some small java project");

    }
}

	
public class Practice7_8{

	public static void main(String[] args) {
		   LearningJava java1 = new LearningJava();
	       LearningJava java2 = new LearningJava("小红");
	 }
}
