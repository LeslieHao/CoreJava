package com.td.corejava.section14_multithreading;

/**
 * DESC:
 * Created by Hh on 2017/12/26
 */
public class VolatileThread extends Thread {

    private volatile boolean isStop = false;

    @Override
    public void run() {
        while (!isStop) {
            System.out.println("运行中。。。");
        }
    }



    public static void main(String[] args) {
        VolatileThread vt = new VolatileThread();
        vt.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        vt.mStop();
    }


}
