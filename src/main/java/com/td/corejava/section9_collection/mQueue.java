package com.td.corejava.section9_collection;

import org.junit.Test;

import java.util.Queue;

/**
 * DESC: 队列
 *
 *  队列接口指出可以在队列尾部添加元素，头部删除元素，查找队列元素个数。
 *  当需手机对象，并且按照先进先出的规则检索对象时就应该使用队列
 *
 *  队列通常有两种实现方式：一种是使用循环数组；另一种是使用链表
 *  循环数组比链表效率要高效，但是循环数组是一个有界集合，如果要收集的对象数量没有上限，就最好用链表来变现。
 * Created by Hh on 2017/11/21
 */
public interface mQueue<E>  {

    void add();

    E remove();

    int size();

}
