package com.td.section5_extends;

import org.junit.Test;

/**
 * DESC: 包装类
 * Created by Hh on 2017/11/2
 */
public final class Wrapper {

    @Test
    public void test1(){
//        Integer integer = new Integer(1);
//        Object o = integer;
//        System.out.println(o.toString());
//        o = 2;
//        System.out.println(o.toString());
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        System.out.println(a==b);
        String str = "a123";
}
}
