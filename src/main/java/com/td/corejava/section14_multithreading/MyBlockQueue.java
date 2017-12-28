package com.td.corejava.section14_multithreading;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * DESC: 阻塞队列
 * Created by Hh on 2017/12/28
 */
public class MyBlockQueue {

    void test1() {
        LinkedBlockingDeque lbq = new LinkedBlockingDeque(10);
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        lbq.put(1); //如果队列满 put 方法阻塞
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread1.start();
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        lbq.take(); // 如果队列空 take 方法阻塞
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread2.start();
        while (true) {
            System.out.println(lbq.size()+"---"+thread1.getState());
            System.out.println(thread2.getState());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyBlockQueue().test1();
    }

}
