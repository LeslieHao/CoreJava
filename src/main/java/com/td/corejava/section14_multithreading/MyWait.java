package com.td.corejava.section14_multithreading;

/**
 * DESC: wait & notify
 * 这两个方法只有在 synchronized 方法或者代码块中才能使用
 * 当wait 方法被调用时，当前线程被中断运行，并且放弃该对象锁
 * 当其他线程执行了此对象的notify 方法，就会唤醒次对象等待池中的某个线程成为可运行状态
 * notifyALl 方法则会唤醒所有
 * Created by Hh on 2017/12/21
 */
public class MyWait {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Thread p = new Thread(new Producter(clerk));
        p.setName("生产商");
        Thread c = new Thread(new Customer(clerk));
        c.setName("顾客");
        p.start();
        c.start();
    }

    public static class Clerk {

        int productNum = 0;

        public synchronized void add() throws InterruptedException {
            if (productNum >= 10) {
                    wait();
            } else {
                productNum++;
                System.out.println(Thread.currentThread().getName() + "--添加了一个产品,现在共有" + productNum + "个产品");
                notifyAll(); // 通知所有线程
            }
        }

        public synchronized void get() throws InterruptedException {
            if (productNum <5) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + "--买走了一个产品,现在共有" + productNum + "个产品");
                productNum--;
                notifyAll();
            }
        }

    }

    public static class Producter implements Runnable {

        private Clerk clerk;

        public Producter(Clerk clerk) {
            this.clerk = clerk;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep((long) (Math.random()*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    clerk.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Customer implements Runnable {

        private Clerk clerk;

        public Customer(Clerk clerk) {
            this.clerk = clerk;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep((long) (Math.random()*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    clerk.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
