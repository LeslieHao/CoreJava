package com.td.corejava.section14_multithreading;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * DESC:
 * Created by Hh on 2017/12/27
 */
public class MyAtomic {


    @Test
    public void demo1(){
        AtomicInteger num = new AtomicInteger(1);
        // 原子的方式将一个整数自增 自减
        num.incrementAndGet();
        num.decrementAndGet();
        System.out.println(num);
    }
}
