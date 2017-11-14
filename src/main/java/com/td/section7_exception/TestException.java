package com.td.section7_exception;

import org.junit.Test;

import java.io.IOException;

/**
 * DESC:
 * Created by Hh on 2017/11/10
 */
public class TestException {

    @Test
    public void test1() {

        int[] arr = new int[10];

        arr[-1] = 0;
    }

    class AAA{

        void test() {

        }
    }
    class BBB extends AAA{

        @Override
        void test() {
        }
    }

    @Test
    public void testThrowE() throws MyException {
        throw new MyException("抛出了一个自定义异常");
    }

}
