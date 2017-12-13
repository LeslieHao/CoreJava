package com.td.corejava.demo;

import java.util.Date;
import java.util.Optional;
import javax.xml.crypto.Data;
import org.junit.Test;

/**
 * DESC: Created by Hh on 2017/12/13
 */
public class OptionalDemo {

  private void test1(Date date) {
    date.hashCode();
  }

  private String test2(Date date) {
//    return date.toString();

//    return Optional.ofNullable(date)
//        .map(str -> date.toString())
//        .orElse("传入了null");


    return Optional.ofNullable(date)
        .map(str -> date.toString())
        .orElseThrow(() -> new NullPointerException("空指针异常"));
  }

  @Test
  public void test2() {
    Date date = new Date();
    System.out.println(test2(date));
  }
}
