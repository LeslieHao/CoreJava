package com.td.section7_exception;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * DESC:
 * Created by Hh on 2017/11/10
 */
public class TryCatch {

    @Test
    public void test1(){
        try {
            File file = new File("");
            FileOutputStream fos = new FileOutputStream(file);
            String cls = "";
            Class.forName(cls);
            System.out.println("如果上面代码抛出异常，后面代码就不会执行");
        } catch (FileNotFoundException |ClassNotFoundException e) {
            System.out.println(e.getClass().getName()+"被捕获");
        }
    }
}
