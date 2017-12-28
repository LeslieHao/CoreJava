package com.td.corejava.section14_multithreading;

import java.util.HashMap;
import java.util.Map;

/**
 * DESC: final 保证也可以保证线程安全
 * Created by Hh on 2017/12/27
 */
public class MyFinal {

    void demo(){
        // 如果不适用final 其他线程可能访问到的是 null
        final Map<String, Double> accounts = new HashMap();
        // 映射表操作并不能保证安全
        accounts.put("", 123.00);
    }
}
