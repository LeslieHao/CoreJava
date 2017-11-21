package com.td.corejava.section5_extends;

import org.junit.Test;

/**
 * DESC:
 * Created by Hh on 2017/10/19
 */
public class Animal implements Cloneable{

    private int age;

    public int num;

    private int sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Animal(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        return age == animal.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Test
    public void testFinal() {
        System.out.println("ImplementsDemo ...");
    }

    private void sayHello(){
        System.out.println("Hello----");
    }
}
