package com.td.corejava.section14_multithreading;

import java.util.HashMap;
import java.util.Map;

/**
 * DESC: 原子性 非原子性
 * Created by Hh on 2017/12/26
 */
public class VolatileThread2 {


    private volatile static int num = 0;

    private static Object object = new Object();

    static class mThread extends Thread {

        @Override
        public void run() {
            synchronized (VolatileThread2.class) {
                for (int i = 0; i < 100000; i++) {
//                    num++; // 不具有原子性 非线程安全的  先读->加一->写入内存（可能第二步到第三步的时候被线程调度器中断）
                    num = i; // 原子操作
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
