package com.td.section7_exception;

import com.td.BaseObject;
import org.junit.Test;


/**
 * DESC:
 * Created by Hh on 2017/11/16
 */
public class MyLog extends BaseObject {


    @Test
    public void test1(){
//        Logger.getGlobal().info("123");
        log.info("log4j-----");
    }
}
