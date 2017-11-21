package com.td.corejava.section6_interface;

/**
 * DESC:
 * Created by Hh on 2017/11/3
 */
public interface DoThingOne {
    int b = 0;

    void do1();

    default void defaultM(){
        System.out.println("默认方法被执行");
    }

}
