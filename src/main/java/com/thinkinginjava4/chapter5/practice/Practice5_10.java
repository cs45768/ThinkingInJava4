package com.thinkinginjava4.chapter5.practice;

class DownloadPicture{
    boolean isClose = false;

    void closeInternet(){
        isClose = true;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (!isClose){//如果网络没有关闭，则发出警告
            System.err.println("internet is not close");
        }
    }
}
public class Practice5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DownloadPicture down = new DownloadPicture();
	        down.closeInternet();
	        new DownloadPicture();
	        //由于真实情况很难碰到内存不够用，所以用该代码来强行中止程序动作，
	        // 达到模拟垃圾回收器回收该对象的目的
	        System.gc();
	}

}
