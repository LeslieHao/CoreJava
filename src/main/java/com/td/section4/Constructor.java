package com.td.section4;

import java.util.Date;

/**
 * DESC: 构造
 * Created by Hh on 2017/10/26
 */
public class Constructor {

    private int age;

    private Date birthday;

    private boolean isMan;

    private Constructor(int age){

    }

    public Constructor(Date birthday) {
        this(1);
    }

    void test(String a) {

    }

    void test(int a) {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "age=" + age +
                ", birthday=" + birthday +
                ", isMan=" + isMan +
                '}';
    }

    public static void main(String[] args) {
//        Constructor constructor = new Constructor();
//        System.out.println(constructor.toString());
    }

}
