package com.td.corejava.section14_multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * DESC: 锁测试 与 锁超时
 * Created by Hh on 2017/12/28
 */
public class MyTryLock {
    /*
        在线程调用lock 方法来获取另一个线程所持有的锁的时候，很可能发生阻塞。
        tryLock 方法视图申请一个锁，在成功后返回true，否则返回false，线程可以立即离开去做其他的事情
     */
    void demo() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
//        if (lock.tryLock()) {
        if (lock.tryLock(100, TimeUnit.SECONDS)) {
            // 获取锁
            try {
                // ...
            }finally {
                lock.unlock();
            }
        } else {
            // do something else
        }

    }
}
