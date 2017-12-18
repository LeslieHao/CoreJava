package com.td.corejava.section14_multithreading;

import java.util.concurrent.TimeUnit;

/**
 * DESC:
 * Created by Hh on 2017/12/18
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {

        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程：----" + Thread.currentThread().getName());
    }
}
