package com.td.section5;

import org.junit.Test;

/**
 * DESC: 枚举
 * Created by Hh on 2017/11/2
 */
public class MyEnum {

    /**
     * 所有的枚举类都是Enum的子类。
     * 它们继承了这个类的许多方法。
     */

    enum Size {
        SMALL,
        MEDIUM,
        LARGER,
        EXTRA_LARGER
    }

    @Test
    public void test1(){
        // 返回枚举常量名
        System.out.println(Size.MEDIUM.toString());
        Size s = Size.MEDIUM;
        System.out.println(s);
        System.out.println(Size.MEDIUM.ordinal());
    }

}
