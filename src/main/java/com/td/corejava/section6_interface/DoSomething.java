package com.td.corejava.section6_interface;

/**
 * DESC:
 * Created by Hh on 2017/11/3
 */
public interface DoSomething extends DoThingOne, DoThingTwo {

    int a = 0;

    void doNow(String string);

    static void staticM(){
        System.out.println("接口中可以存在静态方法");
    }

    default void defaultM() {
        System.out.println("子类接口默认方法执行");
    }
}
