package com.td.section5;


/**
 * DESC: Object
 * Created by Hh on 2017/10/30
 */
public class FatherObject {

    void test1(){
        Object object = new String();
    }



    public static void main(String[] args) {
        Animal animal = new Animal();
        Man man = new Man();
        System.out.println(animal.equals(animal) );
    }
}
