package com.td.corejava.section14_multithreading;

/**
 * DESC: 对象锁 和 类锁
 * Created by Hh on 2017/12/26
 */
public class MySynchronized1 {

    /**
     * 类锁
     * 多线程调用类方法时 阻塞
     */
    private void classSync() {
        synchronized (this) {
            // do something...
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
//        synchronized (MySynchronized1.class) {
//            // do something...
//        }
    }

    /**
     * 对象锁
     * 当多线程调用相同实例（object）的时候  阻塞
     */
    static class ObjThread extends Thread {
        private Object obj;

        public ObjThread(Object obj) {
            this.obj = obj;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    private static void testClassSync() {
        MySynchronized1 m = new MySynchronized1();
        Runnable r = () -> m.classSync();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    private static void testObjSync() {
        MySynchronized1 m = new MySynchronized1();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Thread t1 = new ObjThread(obj1);
        Thread t2 = new ObjThread(obj1);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
//        testClassSync();
        testObjSync();
    }



}
