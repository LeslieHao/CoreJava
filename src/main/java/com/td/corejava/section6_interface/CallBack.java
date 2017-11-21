package com.td.corejava.section6_interface;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;

/**
 * DESC: 接口回调
 * Created by Hh on 2017/11/3
 */
public class CallBack {


    @Test
    public void test1() {
        ActionListener actionListener = new TimePrinter();
        Timer timer = new Timer(1000, actionListener);
        timer.start();
        JOptionPane.showMessageDialog(null, "退出？");
        System.exit(0);
    }

    @Test
    public void test2() {

        String[] strs = new String[]{"222", "333", "1111", "ssaa", "sssss"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
    }


    class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
