package com.td.corejava.section9_collection;

import com.td.corejava.BaseObject;
import org.junit.Test;

import java.util.HashSet;

/**
 * DESC: 散列集
 * 散列表为每一个对象计算一个整数，称为散列码 hash code。
 * 散列码是由对象的实例域产生的一个整数
 * Created by Hh on 2017/11/30
 */
public class mHashTable extends BaseObject {

    /**
     *  set 是没有重复元素的集合， add方法首先要在集合中查找添加的对象，如果不存在就将这个对象添加进去，返回true
     *  如果存在，就返回false
     */
    @Test
    public void test1(){
        HashSet hs = new HashSet();

        hs.add("Jack");

        log.info(hs.add("Jack"));

        log.info(hs.toString());

    }
}
