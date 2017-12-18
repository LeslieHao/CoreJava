package com.td.corejava.section14_multithreading;

import com.td.corejava.BaseObject;
import java.util.Date;

/**
 * DESC: 什么是线程 synchronized 用法
 * Created by Hh on 2017/12/13
 */
public class mSynchronized extends BaseObject {

  private void sayNums() throws InterruptedException {
    Thread thread = new Thread(() -> {
      for (int i = 0; i < 2; i++) {
        log.info(new Date());
        try {
          log.info("子线程" + Thread.currentThread());
          Thread.sleep(10000); //当前线程睡眠
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    thread.start();
    for (int i = 0; i < 20; i++) {
      log.info(i);
      log.info(Thread.currentThread());
      Thread.sleep(1000);
    }
  }

  String a = "";


  Thread thread1 = new Thread(new MyThread());
  Thread thread2 = new Thread(new MyThread());
  Thread thread3 = new Thread(new MyThread());

  private void test2() {
    thread1.start();
    thread2.start();
    thread3.start();
  }

  private void doSomething() {
    synchronized (this) {
      for (int i = 0; i < 10; i++) {
        a = a + "a";
        log.info(Thread.currentThread() + String.valueOf(a.length()));
        log.info("thread0" + thread1.getState());
        log.info("thread1" + thread2.getState());
        log.info("thread2" + thread3.getState());
      }
    }
//    try {
//      Thread.sleep(500);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
  }

  class MyThread implements Runnable {

    @Override
    public void run() {
      doSomething();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    mSynchronized whatIsThread = new mSynchronized();
//    whatIsThread.sayNums();
    whatIsThread.test2();
  }

}
