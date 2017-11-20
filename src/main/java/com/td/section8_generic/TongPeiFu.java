package com.td.section8_generic;

import com.td.section5_extends.Animal;
import com.td.section5_extends.Man;

/**
 * DESC: 通配符
 * Created by Hh on 2017/11/20
 */
public class TongPeiFu {

    /**
     * 通配符
     * @param t
     */
    void test1(Generic<? extends Animal> t) { //ok

    }

    /**
     * 通配符限制为 Animal 的所有超类
     * @param t
     */
//    void test3(Generic<? super Animal> t) { //ok
//
//    }


    /**
     * 无限定通配符
     * @param t
     */
    void test3(Generic<?> t) { //ok

    }

    void test2(Generic< Animal> t) {

    }

    void test(){
        test1(new Generic<Man>()); //ok
        test3(new Generic<Object>()); //ok
//        test2(new Generic<Man>()); //error
    }

}
