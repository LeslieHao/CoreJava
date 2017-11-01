package com.td.section5;


import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * DESC: Object
 * Created by Hh on 2017/10/30
 */
public class FatherObject {

    void test1() {
        Object object = new String();
    }

    @Test
    public void testEquals() {
        Animal animal = new Animal(1);
        Animal animal1 = new Animal(1);
        System.out.println(animal.equals(animal1));

//        Man man = new Man(1);
//        System.out.println(man.equals(animal));
//        System.out.println(animal instanceof Man);
    }

    @Test
    public void testHashCode(){
        Animal animal = new Animal(1);
        Animal animal1 = new Animal(1);
        System.out.println(animal.hashCode()==animal1.hashCode());
        String str = "hello";
        System.out.println(str.hashCode());
        System.out.println(animal.hashCode());
    }



    @Test
    public void testToString(){
        System.out.println(toString());
        System.out.println(getClass());
        System.out.println();
    }

    @Test
    public void testArrayList(){
        // 初始容量传递给构造器
        ArrayList<String> arrayList = new ArrayList<String>();
        //  分配一个包含100个对象的内部数组。然后调用100次add时，不用重新分配空间
        String[] strings = new String[100];
        System.out.println(arrayList.size()); //输出 0
        System.out.println(strings.length); // 输出100
        for (int i = 0; i < 15; i++) {
            arrayList.add("eee");
        }
    }

    @Test
    public void testArrayList1(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("666");
        arrayList.add("777");
    }


}
