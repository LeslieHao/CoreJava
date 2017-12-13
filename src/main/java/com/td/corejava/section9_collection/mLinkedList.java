package com.td.corejava.section9_collection;

import com.td.corejava.BaseObject;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * DESC:
 * Created by Hh on 2017/11/30
 */
public class mLinkedList extends BaseObject {

    @Test
    public void test1(){
        List<String> list = new LinkedList<>();

        list.add("one");

        list.add("two");

        list.add("three");

        Iterator iterator = list.iterator();

        String a = (String) iterator.next();

        String b = (String) iterator.next();

        iterator.remove();

        log.info(list.toString()+iterator.next());

        list.add(1, "222");

        log.info(list);
    }

    @Test
    public void test2(){
        List<String> list = new LinkedList<>();

        list.add("one");

        list.add("two");

        list.add("three");

        /*
             这里的get方法做了微小的优化 如果 index > size>>1 的话 从末尾开始遍历查找
          */
        list.get(1);

        //  可以反向遍历集合
        ListIterator iter = list.listIterator();

        iter.next();
        iter.next();

        iter.set("2222");

        log.info(list);

        log.info(4>>>1);

    }



}
