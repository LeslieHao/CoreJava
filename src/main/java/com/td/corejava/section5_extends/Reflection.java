package com.td.corejava.section5_extends;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * DESC: 反射技术
 * Created by Hh on 2017/11/2
 */
public class Reflection {

    @Test
    public void test1() {
        Reflection reflection = new Reflection();
//        System.out.println(reflection.getClass().getName());
//        System.out.println(reflection.getClass().getMethods());
        // 通过全类名 创建对象
        String className = "Reflection";
        try {
            Reflection reflection1 = (Reflection) Class.forName(className).newInstance();
            System.out.println(reflection1.getClass());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() throws ClassNotFoundException {
        String className = "Animal";
        Class cls = Class.forName(className);
        Method[] methods = cls.getDeclaredMethods(); // 获取所有方法
        cls.getMethods();// 获取所有公开的方法
        showArray(methods);
        Field[] fields = cls.getDeclaredFields();
        showArray(fields);
        Constructor[] constructors = cls.getDeclaredConstructors();
        showArray(constructors);
    }

    static void showArray(Object[] objects) {
        System.out.println("----------------print begin ---------------- ");
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        System.out.println("----------------print over ---------------- ");
    }

    /**
     * 反射获取域的值
     */
    @Test
    public void test3() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal(99);
        String className = "Animal";
        Class cls = Class.forName(className);
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true); //所有域都可以被访问
        System.out.println("动物的年龄是---" + field.get(animal));
        field.set(animal, 999);
        System.out.println("动物的年龄被修改为----" + field.get(animal));
    }
    /*
        out:
        动物的年龄是---99
        动物的年龄被修改为----999
     */


    /**
     * 泛型数组 拷贝
     */
    @Test
    public void test4() {
        int[] arr = new int[]{1, 2, 3};
        Class cls = arr.getClass();
        Class com = cls.getComponentType();
        int length = Array.getLength(arr);
        Object newArr = Array.newInstance(com, length);
        System.arraycopy(arr, 0, newArr, 0, Math.min(3,length));
        System.out.println(Arrays.toString((int[]) newArr));
    }

    /**
     * 反射 调用方法
     */
    @Test
    public void test5() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Animal animal = new Animal(100);
        Method method = Animal.class.getDeclaredMethod("sayHello");
        method.setAccessible(true);
        method.invoke(animal);
    }
}
