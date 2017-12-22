package com.td.corejava.section14_multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * DESC: 两种锁功能相似  但使用Synchronized 代码更简洁
 * 每一个对象都有一个内部锁，并且该锁有一个内部条件。
 * 由锁来管理那些试图进入synchronized 方法的线程，有条件来管理调用wait 的线程
 * Created by Hh on 2017/12/22
 */
public class MySynchronized {

    ReentrantLock reentrantLock = new ReentrantLock();

    Condition condition = reentrantLock.newCondition();

    /**
     * m1 等价于 m2
     */
    public synchronized void method1() {
        // ...
    }
    public void method2() {
        reentrantLock.lock();
        try {
            // ...
        } finally {
            reentrantLock.unlock();
        }
    }


    /**
     * m3 等价于 m4
     *
     * @throws InterruptedException
     */
    boolean c = true;

    public synchronized void method3() throws InterruptedException {
        while (c)
            wait();
        // ...
        notifyAll();
    }

    public void method4() throws InterruptedException {
        reentrantLock.lock();
        try {
            while (c)
                condition.await();
            // ...
            condition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
