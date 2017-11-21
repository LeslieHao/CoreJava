package com.td.corejava.section8_generic;

import com.td.corejava.BaseObject;


/**
 * DESC: 泛型
 * Java 库中 使用E 表示集合元素类型，K和V分别表示关键字和值的类型。
 * T 表示任意类型
 * Created by Hh on 2017/11/17
 */
public class GenericObject<T> extends BaseObject {

    private T first;

    private T second;

    public GenericObject(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static void main(String[] args) {
        GenericObject<String> g = new GenericObject<>("1111", "2222");
        System.out.println(g.getFirst()+g.getSecond());
    }
}
