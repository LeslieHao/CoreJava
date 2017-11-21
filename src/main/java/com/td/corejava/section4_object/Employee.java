package com.td.corejava.section4_object;

import java.time.LocalDate;

/**
 * DESC:
 * Created by Hh on 2017/10/26
 */
public class Employee {

    private String name;

    private double salary;

    private LocalDate hireDay;

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    void getNum(int num) {
        String str = this.name; // this 表示隐式参数

        int n = num; // 显式参数

    }

}
