package com.td.corejava.section14_multithreading;

import java.util.concurrent.*;

/**
 * DESC:
 * Created by Hh on 2017/12/29
 */
public class MyCallableAndFuture {

    void demo() {
        Callable<Double> callable = () -> Math.random() * 10 ;

        ExecutorService threadPool = Executors.newSingleThreadExecutor();

//        Future<Double> future = threadPool.submit(callable);

        FutureTask<Double> future = new FutureTask(callable);
        new Thread(future).start();


        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }

    public static void main(String[] args) {
        new MyCallableAndFuture().demo();
    }
}
