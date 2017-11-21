package com.td.corejava.section7_exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 * DESC:
 * Created by Hh on 2017/11/16
 */
public class Finally {

    /**
     * finally 始终都会被执行
     */
    @Test
    public void testFinally() {
        FileInputStream fis = null;
        try {
            System.out.println("try 块被执行");
            fis = new FileInputStream(new File("D:/eclipse/ddl"));
        } catch (FileNotFoundException e) {
            System.out.println("catch 块被执行");
        } finally {
            System.out.println("finally 块被执行");
        }
    }


    @Test
    public void testFinally2() {
        System.out.println(get());
    }

    /**
     * finally 中的返回值会将catch中的返回值覆盖
     *
     * @return
     */
    public String get() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("D:/eclipse/dd"));
        } catch (FileNotFoundException e) {
            System.out.println("catch 块被执行");
            return "catch";
        } finally {
            System.out.println("finally 块被执行");
            return "finally";
        }
    }


    /**
     * Java 7 带资源的try语句（try with resource）
     * 括号中的资源在try 块执行完之后会自动关闭
     */
    @Test
    public void testRes() {
        try (
                FileInputStream fis1 = new FileInputStream(new File("D:/eclipse/dd"));
                FileInputStream fis2 = new FileInputStream(new File("D:/eclipse/dd"))
        ) {
            /////////
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }


}
