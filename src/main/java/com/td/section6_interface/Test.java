package com.td.section6_interface;


/**
 * DESC:
 * Created by Hh on 2017/11/3
 */
public class Test {

    @org.junit.Test
    public void test1(){
        DoSomething doSomething = new ImplementsDemo();
        ImplementsDemo implementsDemo = new ImplementsDemo();
//        doSomething.doNow("你好");
//        System.out.println(implementsDemo instanceof DoSomething); //检查类是否实现接口
        implementsDemo.defaultM();
    }
}
