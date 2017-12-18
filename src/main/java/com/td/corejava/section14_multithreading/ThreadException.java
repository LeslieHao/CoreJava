package com.td.corejava.section14_multithreading;

/**
 * DESC: 未捕获异常处理器
 * Created by Hh on 2017/12/18
 */
public class ThreadException implements Thread.UncaughtExceptionHandler {

    private void test1(){
        Thread t = new Thread(() -> {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[3]);
        });
        t.setUncaughtExceptionHandler(this);
        t.start();
    }

    public static void main(String[] args) {
        ThreadException te = new ThreadException();
        te.test1();
    }


    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("异常被这里处理了");
        System.out.println("线程状态："+t.getState()+"\t异常信息"+e.toString());
    }
}
