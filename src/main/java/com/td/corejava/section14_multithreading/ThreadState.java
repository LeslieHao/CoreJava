package com.td.corejava.section14_multithreading;

import com.td.corejava.BaseObject;


/**
 * DESC: 线程状态
 * Created by Hh on 2017/12/18
 */
public class ThreadState extends BaseObject {

    //最小优先级
    public final static int MIN_PRIORITY = 1;

    //一般优先级
    public final static int NORM_PRIORITY = 5;

    //最大优先级
    public final static int MAX_PRIORITY = 10;

    private Thread[] tr = new Thread[]{
            new Thread(new MyRunnable()), new Thread(new MyRunnable()), new Thread(new MyRunnable())};


    private void test1() {
        tr[0].setPriority(MIN_PRIORITY);
        tr[1].setPriority(NORM_PRIORITY);
        tr[2].setPriority(MAX_PRIORITY);
        for (int i = 0; i < tr.length; i++) {

            tr[i].start();
            if (i == 0) {
                synchronized (tr[0]) {
                    try {
                        tr[0].wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }


    public static void main(String[] args) {
        ThreadState ts = new ThreadState();
        ts.test1();
    }


    class MyRunnable implements Runnable {
        @Override
        public void run() {
            doSync();
        }
    }

    private void doSync() {
        synchronized (this) {
            int count = 1;
            while (count <= 10) {
                System.out.println("当前线程：----" + Thread.currentThread().getName() + "\tcount:" + count);
                printStates();
                count++;
            }
        }
    }

    private void printStates() {
        for (int i = 0; i < tr.length; i++) {
            System.out.println("线程：" + i + "\t状态：" + tr[i].getState());
        }
    }
}



