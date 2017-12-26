package com.td.corejava.section14_multithreading;

/**
 * DESC:
 * Created by Hh on 2017/12/26
 */
public class MyVolatile {

    class V1 {
        private int num;

        public synchronized int getNum() {
            return num;
        }

        public synchronized void setNum(int num) {
            this.num = num;
        }

    }

    class V2 {
        private volatile int num;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

    }

}
