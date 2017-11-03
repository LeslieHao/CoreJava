package com.td.section5_extends;

import org.junit.Test;

import java.util.Arrays;

/**
 * DESC: 参数数量可变方法
 * Created by Hh on 2017/11/2
 */
public class ManyParameter {

    void test1(String... strings) {
        System.out.println(Arrays.toString(strings));
    }

    @Test
    public void test2(){
        test1("p1", "p2");
        test1(new String[]{"",""});
    }
}
