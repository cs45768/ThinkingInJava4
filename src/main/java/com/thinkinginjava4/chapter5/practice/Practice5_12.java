package com.thinkinginjava4.chapter5.practice;


class Tank{
	boolean empty ;
    String name;
    public Tank(String name){
        this.name = name;
        empty = true;//默认为满的
    }

    public Tank(String name,boolean isEmpty){//构造方法
        this.name = name;
        empty = isEmpty;
    }

    void clear(){//使状态变成空
        empty = false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (empty){
            System.err.println("tank : " + name + " is empty");
        }
    }
	
	
}
public class Practice5_12 {

	public static void main(String[] args) {
		 //默认为满的并且清理
        Tank tank = new Tank("tank");
        tank.clear();
        //默认为满的且不清理
//        Tank tank1 = new Tank("tank1");这种写法System.gc()无法生效。
        new Tank("tank1");
        //默认为空且不清理
        new Tank("tank2",false);
        //默认为空并且清理
        Tank tank3 = new Tank("tank3",false);
        tank3.clear();

        System.gc();//使达到垃圾回收状态
	}

}
