package com.td.corejava.section9_collection;

import org.junit.Test;

import java.util.*;
import java.util.List;

/**
 * DESC: 迭代器
 * Created by Hh on 2017/11/21
 */
public class mIterator {

    /**
     * 迭代器的优势在于可以统一的处理集合，而不关心集合内部类型（多态性）
     * 编译器将for each 循环翻译为带有迭代器的循环， for each 可以与任何实现了 Iterable 接口的对象一起工作
     */
    @Test
    public void test1(){
        List<String> c = Arrays.asList("Bob", "Jack", "Jenny");
        Iterator<String> i = c.iterator();
        i.next();
        i.remove();
//        i.remove(); //不合法。必须先调用 next() 方法
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (String str : c) {
            System.out.println(str);
        }
        System.out.println(i.hasNext()); // 这里 i 已经迭代完毕了  所以下面的lambda 表达式就不会打印了。
        i.forEachRemaining(System.out::println);

    }
}
