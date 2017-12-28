package com.td.corejava.section14_multithreading;

import java.text.SimpleDateFormat;

/**
 * DESC: 线程局部变量
 * Created by Hh on 2017/12/27
 */
public class MyThreadLocal {

    public static final ThreadLocal<SimpleDateFormat> dateFormat
            = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

}
