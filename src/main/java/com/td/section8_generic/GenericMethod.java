package com.td.section8_generic;

import com.td.BaseObject;
import org.junit.Test;

import java.io.Serializable;

/**
 * DESC: 泛型方法
 * 泛型方法可以定义在普通类中，也可以定义在泛型类中。
 * Created by Hh on 2017/11/17
 */
public class GenericMethod extends BaseObject {

    public static <T> void method1(T... a) {
        System.out.println(a);
    }

    @Test
    public void test(){
//        method1("Hello",111,222,"123");
//        GenericMethod.<String >method1("123", "123");
        log.info(min(new Integer[]{1, 3, 0, 4, 5}));
        log.info(max(new Integer[]{1, 3, 0, 4, 5}));
    }

    /**
     * 类型变量的限定
     * @param arr
     * @param <T>
     * @return
     */
    private static <T extends Comparable & Serializable> T min(T[] arr){
        if (arr==null||arr.length==0)
            return null;
        T num = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (num.compareTo(arr[i])>0)
                num = arr[i];
        return num;
    }

    private static <T extends Comparable & Serializable> T max(T[] arr){
        if (arr==null||arr.length==0)
            return null;
        T num = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (num.compareTo(arr[i])<0)
                num = arr[i];
        return num;
    }

}
