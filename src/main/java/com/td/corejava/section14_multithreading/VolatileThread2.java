package com.td.corejava.section14_multithreading;

/**
 * DESC:
 * Created by Hh on 2017/12/26
 */
public class VolatileThread2 {


    private static int num = 0;

    private static Object object = new Object();

    static class mThread extends Thread {

        @Override
        public void run() {
            synchronized (VolatileThread2.class) {
                for (int i = 0; i < 100000; i++) {
                    num++;
                }
                System.out.println(Thread.currentThread().getName() + "--" + num);
            }
        }

    }

    public static void main(String[] args) {
        mThread t1 = new mThread();
        mThread t2 = new mThread();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
