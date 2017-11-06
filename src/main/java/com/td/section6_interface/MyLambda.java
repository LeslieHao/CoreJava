package com.td.section6_interface;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * DESC: Lambda
 * Created by Hh on 2017/11/6
 */
public class MyLambda {

    @Test
    public void test1() {
        Timer timer = new Timer(1000, e -> {
            System.out.println("time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
        JOptionPane.showMessageDialog(null, "退出？");
        System.exit(0);
    }

    @Test
    public void test2(){
        String[] planets = new String[] { "Mercury" , "Venus" , "Earth" , "Mars" ,
                "Jupiter" , "Saturn" , "Uranus" , "Neptune" };
        Arrays.sort(planets, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, System.out::println);

    }

    class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

}
