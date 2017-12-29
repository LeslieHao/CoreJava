package com.td.corejava.section14_multithreading;

import java.util.concurrent.ConcurrentHashMap;
/**
 * DESC:
 * Created by Hh on 2017/12/29
 */
public class MyConcurrent {
    void demo1() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.mappingCount();
    }
}
