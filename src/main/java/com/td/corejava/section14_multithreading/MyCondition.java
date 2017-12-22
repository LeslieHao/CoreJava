package com.td.corejava.section14_multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * DESC: 条件
 * Created by Hh on 2017/12/21
 */
public class MyCondition {

    private void conditionMethod() {
        int num = 0;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            while (num < 10)
                condition.await(); // 如果小于10 就将线程放到条件的等待集中
            System.out.println(num);
            condition.signal(); // 随机选择一个等待集中的线程 解除阻塞状态
            condition.signalAll(); // 解除该条件的等待集中所有的线程阻塞状态
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }

    }
    Thread t1 = new Thread(new MyRun());
    Thread t2 = new Thread(new MyRun());
    void testWait(){
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        MyCondition myCondition = new MyCondition();
        myCondition.testWait();
    }

    private final Object object = new Object();

    class MyRun implements Runnable {
        @Override
        public void run() {
            ReentrantLock lock = new ReentrantLock();
            lock.lock();
            try {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i + "t1" + t1.getState());
                    System.out.println(i + "t2" + t2.getState());
                }
            } finally {
                lock.unlock();
            }
        }
    }

}
