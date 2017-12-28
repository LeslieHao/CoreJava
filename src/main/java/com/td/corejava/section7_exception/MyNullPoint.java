package com.td.corejava.section7_exception;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.Date;

/**
 * DESC:
 * Created by Hh on 2017/12/28
 */
public class MyNullPoint {

    @Test
    public void test(){
        m(null);
    }

    void m(Date d) {
//        System.out.println(d.getTime());
        System.out.println(d);
    }
}
