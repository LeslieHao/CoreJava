package com.td.corejava.section14_multithreading;

import java.util.*;

/**
 * DESC: 任何集合类 都可以通过使用同步包装器 变成线程安全的
 * 最好使用 java.util.concurrent 包中定义的集合，不使用包装类
 * Created by Hh on 2017/12/29
 */
public class MySyncListMap {

    List syncList = Collections.synchronizedList(new ArrayList<>());

    Map syncMap = Collections.synchronizedMap(new HashMap<>());
}
