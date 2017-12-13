package com.td.corejava.section9_collection;

import com.td.corejava.BaseObject;
import org.junit.Test;
import java.util.*;

import static com.td.corejava.Constants.*;

/**
 * DESC: 算法
 * Created by Hh on 2017/12/7
 */
public class mAlgorithm extends BaseObject {



    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (10 * Math.random()));
        }
        list.sort(Comparator.comparingInt(o -> o));
        log.info(list);
        log.info(max(list));
    }

    /**
     * 拿出集合中的最大值
     *
     * @param c
     * @param <T>
     * @return
     */
    private <T extends Comparable> T max(Collection<T> c) {
        if (c.isEmpty())
            throw new NoSuchElementException();
        Iterator<T> iter = c.iterator();
        T largest = iter.next();
        while (iter.hasNext()) {
            T next = iter.next();
            if (next.compareTo(largest) > 0) {
                largest = next;
            }
        }
        return largest;
    }


    @Test
    public void test2() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (10 * Math.random()));
        }
//        list.sort(Comparator.comparingInt(value -> value));
        Collections.sort(list);
        log.info(list);
    }

    @Test
    public void test3() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * 10);
            list.add(new Employee(
                    firsname[randomNum] + namelist[randomNum],
                    (int) (10000 * Math.random())
            ));
        }

//        list.sort((o1, o2) -> {    //升序
//            Double o1s = o1.getSalary();
//            Double o2s = o2.getSalary();
//            return o1s.compareTo(o2s);
//        });
        // 降序
        list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.println(list);
    }


    class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
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

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}' + "\n";
        }
    }
}
