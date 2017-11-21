package com.td.corejava.section9_collection;

import com.td.corejava.BaseObject;
import org.junit.Test;

import java.util.*;

/**
 * DESC: Collection
 * Created by Hh on 2017/11/21
 */
public class mCollection<E> extends BaseObject{


    public void test1(Collection<E> c) {
//        for (String str : c) { //编译不通过
//            System.out.println(str);
//        }

        // 不关心类型
        Iterator i = c.iterator();
        i.forEachRemaining(System.out::println);
    }


    @Test
    public void test2() {
        //这里返回的并不是java.util 下的Arraylist
        //而是Arrays的一个内部类 所以调用add和remove等方法会抛出异常
      List<String> list = Arrays.asList("How", "are", "you", "!");

        // 这种初始化赋值才是正确的
//        List<String> list = new ArrayList<>(Arrays.asList("How", "are", "you", "!"));
        list.add("1");
//        list.removeIf(s -> s.equals("!"));
        log.info(list.toString());
    }

}
