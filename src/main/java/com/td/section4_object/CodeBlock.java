package com.td.section4_object;

import java.time.LocalDate;


/**
 * DESC: 代码块
 * Created by Hh on 2017/10/27
 */
public  class CodeBlock {

    private String name;

//    private int age; //可以用一个 Man 类来替代

    private boolean sex;



    static final int num = 99;

    int age;

    static {

//        age = num;
//        age++;
        System.out.println("hello");
    }

    public static void main(String[] args) {
        CodeBlock codeBlock = new CodeBlock();
        System.out.println(codeBlock.age); //输出100
    }

    /**
     * 垃圾回收清除对象之前调用
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        // do something

        LocalDate today = LocalDate.now();
    }
}
