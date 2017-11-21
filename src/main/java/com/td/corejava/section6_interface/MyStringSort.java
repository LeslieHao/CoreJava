package com.td.corejava.section6_interface;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * DESC:
 * Created by Hh on 2017/11/3
 */
public class MyStringSort {

    @Test
    public void test1(){
        String[] strs = new String[]{"a", "bb", "a", "aaaa", "aaa", "aa"};
        Arrays.sort(strs, new LengthComparator());
        System.out.println(Arrays.toString(strs));

    }

    class LengthComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }
}

