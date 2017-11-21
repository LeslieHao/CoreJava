package com.td.corejava.section6_interface;

/**
 * DESC:
 * Created by Hh on 2017/11/3
 */
public class ImplementsDemo implements DoSomething {


    @Override
    public void doNow(String string) {
        System.out.println(string);
    }

    @Override
    public void do1() {
    }

    @Override
    public void do2() {

    }

}
