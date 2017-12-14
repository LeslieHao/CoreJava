package com.td.corejava.section8_generic;

import com.td.corejava.BaseObject;
import com.td.corejava.section5_extends.Animal;
import org.junit.Test;

/**
 * DESC: 泛型用在定义的时候
 *       通配符用在使用的时候
 * Created by Hh on 2017/12/14
 */
public class TPFDemo<T> extends BaseObject {



  public void test1(TPFDemo<?extends Comparable> tpfDemo) {

  }

  public <T> T test3(T t){

    return t;
  }
  public <E> void test4(E t){

  }

  @Test
  public void test2() {
    TPFDemo<Animal> tpfDemo = new TPFDemo<>();
//    test1(tpfDemo); //error
  }
}
