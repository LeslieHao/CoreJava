package com.td.corejava.section4_object;

/**
 * DESC: 方法参数
 * Created by Hh on 2017/10/26
 */
public class Parameter {


    static void test(String a){
        a = "被改了";
    }

    public static void main(String[] args) {
        String a = "没被改";
        test(a);
    }
}
