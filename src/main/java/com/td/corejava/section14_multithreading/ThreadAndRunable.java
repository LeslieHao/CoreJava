package com.td.corejava.section14_multithreading;

import sun.management.VMOptionCompositeData;

/**
 * DESC: 继承Thread 类和实现 Runable 接口的区别
 * Created by Hh on 2017/12/28
 */
public class ThreadAndRunable {


    public static void main(String[] args) {
//        new ThreadAndRunable().test1();
        new ThreadAndRunable().test2();
    }

    void test1(){
        StationThread t1 = new StationThread("东站");
        StationThread t2 = new StationThread("北站");
        StationThread t3 = new StationThread("南站");
        StationThread t4= new StationThread("西站");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
//        t3.run();  run 方法只是单纯的调用方法 并没有启动线程  代码还是顺序执行
    }

    void test2(){
        StationRunable runable = new StationRunable();
         new Thread(runable, "东站").start();
         new Thread(runable, "西站").start();
         new Thread(runable, "南站").start();
         new Thread(runable, "北站").start();
    }

    class StationThread extends Thread {

        public StationThread(String name) {
            super(name);
        }

        int tickets = 10;
        @Override
        public void run() {
            while (tickets > 0) {
                tickets--;
                System.out.println(this.getName()+"-卖了一张票");
            }
        }
    }

    class StationRunable implements Runnable {
        int tickets = 10;

        @Override
        public void run() {
            while (tickets > 0) {
                tickets--;
                System.out.println(Thread.currentThread().getName()+"-卖了一张票");
            }
        }
    }

}
