package com.td.section5;

import org.junit.Test;

/**
 * DESC:
 * Created by Hh on 2017/10/19
 */
public class Animal {

    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Test
    public void testFinal() {
        System.out.println("Test ...");
    }
}
