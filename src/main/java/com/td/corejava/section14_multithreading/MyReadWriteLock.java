package com.td.corejava.section14_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * DESC:
 * Created by Hh on 2017/12/28
 */
public class MyReadWriteLock {

    ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    Lock rl = rwl.readLock(); // 得到一个可以被多个读操作共用的读锁。但会排斥所有的写操作

    Lock wl = rwl.writeLock(); // 得到一个写锁，排斥其他所有的读操作和写操作

    void read(){
        rl.lock();
        try {

        }finally {
            rl.unlock();
        }
    }
    void write(){
        wl.lock();
        try {

        }finally {
            wl.unlock();
        }
    }

}
