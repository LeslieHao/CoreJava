package com.td.corejava.section14_multithreading;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * DESC: 执行器
 * Created by Hh on 2017/12/29
 */
public class MyExecutor {

    void demo() {
        // 必要时创建新线程，空闲线程会被保留60秒
        ExecutorService threadPool1 = Executors.newCachedThreadPool();

        // 返回Future 对象，用来查询该任务的状态
        Future future= threadPool1.submit(() -> {
            // ...
        });
        // 取消任务（如果正在运行 是否取消）
        future.cancel(false);
        /*
            启动该池的关闭序列
            被关闭的执行器不再接受新的任务。
            当所有任务都完成，线程池中的线程死亡。
         */
        threadPool1.shutdown();

        /*
            取消尚未开始的所有任务并试图中断正在运行的线程
         */
        threadPool1.shutdownNow();

        //固定数量的线程池，空闲线程会一直被保留
        ExecutorService threadPool2 = Executors.newFixedThreadPool(10);

        // 只有一个线程的池，该线程顺序执行每一个提交的任务
        ExecutorService threadPool3 = Executors.newSingleThreadExecutor();

        // 用于预定执行而构建的固定线程池
        ExecutorService threadPool4 = Executors.newScheduledThreadPool(10);

        ExecutorService threadPool5 = Executors.newSingleThreadScheduledExecutor();


    }

}
