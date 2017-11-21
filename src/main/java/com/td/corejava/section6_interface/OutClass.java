package com.td.corejava.section6_interface;

import org.junit.Test;

/**
 * DESC: 内部类
 * <p>
 * 嵌套是一种类之间的关系，而不是对象之间的关系。一个OutClass 并不包含一个InnerClass类型的子对象。
 * <p>
 * 使用内部类有两个好处：
 * 1.命名控制和访问控制
 * 2.(非静态)内部类的对象有一个隐式引用，它引用了实例化该内部对象的的外围对象。通过这个指针，可以访问外围对象的全部状态。
 * Created by Hh on 2017/11/6
 */
public class OutClass {

    private String name;

    private int age;

    class InnerClass {

        private boolean sex;

        final static int a = 1;

        void test() {
            name = "张国荣";
            age = 60;
        }

        public void partInnerClass(String param ) {

            final String str = "";

            class PartInnerClass {

                void test() {
                    // 可访问的局部变量必须为final
                    System.out.println(param);
                }
            }
            PartInnerClass partInnerClass = new PartInnerClass();
            partInnerClass.test();
        }



    }

    @Test
    public void test1(){
        InnerClass innerClass = new InnerClass();
        innerClass.partInnerClass("可以吗");
    }

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InnerClass innerClass = outClass.new InnerClass(); //这里 innerClass 会持有 outClass 的隐式引用

    }
}
