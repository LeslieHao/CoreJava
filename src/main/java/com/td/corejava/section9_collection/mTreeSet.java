package com.td.corejava.section9_collection;

import com.td.corejava.BaseObject;
import org.junit.Test;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * DESC: 树集
 * 会自动排序
 * Created by Hh on 2017/11/30
 */
public class mTreeSet extends BaseObject{

    @Test
    public void test1(){
        SortedSet<String> ss = new TreeSet<>();
        ss.add("Jack");
        ss.add("Bob");
        ss.add("David");
        log.info(ss.toString());
    }


}
