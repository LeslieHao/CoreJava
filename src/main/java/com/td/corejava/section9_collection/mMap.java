package com.td.corejava.section9_collection;

import com.td.corejava.BaseObject;
import org.junit.Test;

import java.util.HashMap;

/**
 * DESC: 映射
 * Created by Hh on 2017/11/30
 */
public class mMap extends BaseObject {

    @Test
    public void test1(){
        HashMap hm = new HashMap();
        hm.put(null, null); //允许空值为键
        log.info(hm);
        log.info(hm.get(null));
    }

    @Test
    public void test2(){
        HashMap hm = new HashMap();
//        hm.putIfAbsent(1, "Bob"); //键不存在时放入
//        hm.merge(1, 1, Integer::sum);
        log.info(hm.get(1));
    }


}
