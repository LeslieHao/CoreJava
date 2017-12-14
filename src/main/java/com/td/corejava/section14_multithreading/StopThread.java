package com.td.corejava.section14_multithreading;

/**
 * DESC: 中断线程
 * Created by Hh on 2017/12/14
 */
public class StopThread {

  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      int count = 0;
      while (count<10) {
        count++;
        System.out.println(count);
      }
    });
    thread.start();
    while (true) {
      System.out.println(thread.getState());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
