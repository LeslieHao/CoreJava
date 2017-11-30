package com.td.corejava.section9_collection;

import com.td.corejava.BaseObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * DESC: 集合框架中的接口
 * Created by Hh on 2017/11/21
 */
public class InterfaceOfCollection extends BaseObject {

    @Test
    public void test1(){
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();
        HashSet<Integer> hs = new HashSet<>(); // 无序
        for (int i = 0; i < 5; i++) {
            hs.add(i);
        }
        hs.add(-1);
        System.out.println(hs.toString());
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            ts.add(i);
        }
        ts.add(-1);
        System.out.println(ts.toString());
    }

    @Test
    public void test2(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("num-" + i);
        }
        long time = System.currentTimeMillis();
        for (int i = 100; i < 100000; i++) {
            list.remove(i);
        }
        time = System.currentTimeMillis() - time;
        log.info("花费时间为："+time);
    }


    @Test
    public void test3(){
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("num-" + i);
        }

        long time = System.currentTimeMillis();
        for (int i = 100; i < 100000; i++) {
            list.remove(i);
        }
        time = System.currentTimeMillis() - time;
        log.info("花费时间为："+time);
    }
}
