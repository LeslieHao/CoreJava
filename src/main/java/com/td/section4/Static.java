package com.td.section4;

import java.text.NumberFormat;

/**
 * DESC: 静态
 * Created by Hh on 2017/10/26
 */
public class Static {

    private String name;

    static int id;

    static void test() {
//        this.name;   // 静态方法不能访问实例域 不能操作对象
        int a = id;
        NumberFormat.getCurrencyInstance();

        NumberFormat.getIntegerInstance();
    }

}
