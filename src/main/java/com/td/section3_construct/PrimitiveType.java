package com.td.section3_construct;

/**
 * DESC: 基本数据类型
 * Created by Hh on 2017/10/26
 */
public class PrimitiveType {
    /**
     * 打印大小写字母表
     */
    public static void printLetter() {

        for (int i = 65; i < 91; i++) {
            System.out.print((char) i + "　");
        }
        System.out.println("\n");
        for (int i = 97; i < 123; i++) {
            System.out.print((char) i + "　");
        }
    }

    /**
     * Math 类
     */
    static void testMath() {
        System.out.println(Math.sqrt(4)); //平方根

        System.out.println(Math.pow(2, 2)); //幂运算

        System.out.println(Math.log10(10)); //对数

        System.out.println(Math.sin(3)); //三角函数

        System.out.println(Math.random()); //0~1 之间的double随机

        System.out.println(Math.round(1.5)); //四舍五入 -2

        System.out.println(Math.round(-1.5)); // -1  小数点后大于5的加1 小于5的不加

        System.out.println(Math.ceil(1.2)); //天花板 向上取整

        System.out.println(Math.floor(1.8)); //地板 向下取整
    }

    /**
     * += =+的区别
     */
    static void calculateSign() {
        short a = 1;
        a += 1; //系统会自动进行强制类型转换
//        a = a + 1;  //a+1 返回int型 所以编译不通过
    }

    /**
     * 枚举
     */

    enum Name {
        JACK, BOB, KOBE, BETTY
    }

    public static void main(String[] args) {
//       printLetter();
//        testMath();
//        calculateSign();

        int[][] a = new int[10][10];
    }
}
