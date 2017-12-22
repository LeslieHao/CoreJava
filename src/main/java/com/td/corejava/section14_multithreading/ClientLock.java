package com.td.corejava.section14_multithreading;

/**
 * DESC: 客户端锁
 * Created by Hh on 2017/12/22
 */
public class ClientLock {

    private Object object1 = new Object();
    private Object object2 = new Object();

    /**
     * m1 和 m2 的调用线程之间不会同步。
     */
    void m1(){
        synchronized (object1) {
            // do something
        }
    }
    void m2(){
        synchronized (object2) {
            // do something
        }
    }
}
