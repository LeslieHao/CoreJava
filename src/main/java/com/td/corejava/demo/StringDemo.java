package com.td.corejava.demo;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * DESC: String 类的一些测试
 * Created by Hh on 2017/11/29
 */
public class StringDemo {

    /**
     * 通过反射修改String的内容
     *
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    @Test
    public void changeStrValue() throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello World";
        //getDeclaredField 可以获取类的所有字段； getField只能获取public 字段
        Field field = str.getClass().getDeclaredField("value");
//        Field field = str.getClass().getField("value");
        // true 才可访问私有变量的值
        field.setAccessible(true);
        char[] value = (char[]) field.get(str);
        value[5] = '-';
        System.out.println(str);
    }

    @Test
    public void testStringMethod() {
        String s = "0011001100";
        String newS = s.replace("0", "2");
        System.out.println(s);
        System.out.println(newS);
    }
}
