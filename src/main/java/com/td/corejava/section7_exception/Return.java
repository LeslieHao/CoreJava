package com.td.corejava.section7_exception;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * DESC:
 * Created by Hh on 2017/12/25
 */
public class Return {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            list.get(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("异常后代码");
    }

}
