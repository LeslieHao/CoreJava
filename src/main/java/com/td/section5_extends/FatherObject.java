package com.td.section5_extends;


import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * DESC: Object
 * Created by Hh on 2017/10/30
 */
public class FatherObject {

    void test1() {
        Object object = new String();
    }

    @Test
    public void testEquals() {
        Animal animal = new Animal(1);
        Animal animal1 = new Animal(1);
        System.out.println(animal.equals(animal1));

//        Man man = new Man(1);
//        System.out.println(man.equals(animal));
//        System.out.println(animal instanceof Man);
    }

    @Test
    public void testHashCode(){
        Animal animal = new Animal(1);
        Animal animal1 = new Animal(1);
        System.out.println(animal.hashCode()==animal1.hashCode());
        String str = "hello";
        System.out.println(str.hashCode());
        System.out.println(animal.hashCode());
    }



    @Test
    public void testToString(){
        System.out.println(toString());
        System.out.println(getClass());
        System.out.println();
    }


    /**
     * 通过反射 得到一个ArrayList 的容量
     * @param list
     * @return
     */
    private static Integer getCapacity(ArrayList list) {
        Integer length = null;
        Class c = list.getClass();
        Field f;
        try {
            f = c.getDeclaredField("elementData");
            f.setAccessible(true);
            Object[] o = (Object[]) f.get(list);
            length = o.length;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return length;
    }

    /**
     * 打印输出可以发现 ArrayList 是1.5倍扩容
     */
    @Test
    public void testArrayList(){
        // 初始容量传递给构造器
        ArrayList<String> arrayList = new ArrayList<String>();
        //  分配一个包含100个对象的内部数组。然后调用100次add时，不用重新分配空间
//        String[] strings = new String[100];
//        System.out.println(arrayList.size()); //输出 0
//        System.out.println(strings.length); // 输出100
        for (int i = 0; i < 100; i++) {
            arrayList.add("eee");
            System.out.println(i+1+"--"+getCapacity(arrayList));
        }
    }

    @Test
    public void testArrayList1(){
        int a = 1;
        System.out.println(a<<2); //移位运算
        String[] strs = new String[]{"1", "2"};
        strs = Arrays.copyOf(strs, 3);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    @Test
    public void testArrayList2(){
        ArrayList list = new ArrayList();
        list.add("1111");
        list.add("2222");
//        System.out.println(list.set(1, "00000"));
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};
        nums =  Arrays.copyOf(nums, 6);
        System.out.println(Arrays.toString(nums));
        System.arraycopy(nums, 2, nums, 3, 3);
        nums[3] = 3;
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testArrayList3(){
        ArrayList list = new ArrayList();
        list.add("1111");
        System.out.println(getCapacity(list)); //此时容量输出10
        list.trimToSize();
        System.out.println(getCapacity(list)); // 此时输出1
        list.ensureCapacity(11);
        System.out.println(getCapacity(list)); // 此时输出11
    }


//    /**
//     * 序列化
//     * ArrayList 中的 elementData 被设为transient 禁止序列化的
//     * 这是因为 elementData 动态数组，多数情况下，会存在多个null值，如果进行常规序列化，会存入多个null值，浪费资源
//     * @param
//     * @throws java.io.IOException
//     */
//    private void writeObject(java.io.ObjectOutputStream s)
//            throws java.io.IOException{
//        // Write out element count, and any hidden stuff
//        int expectedModCount = modCount;
//        s.defaultWriteObject();
//
//        // Write out size as capacity for behavioural compatibility with clone()
//        s.writeInt(size);
//
//        // Write out all elements in the proper order.
//        for (int i=0; i<size; i++) {
//            s.writeObject(elementData[i]);
//        }
//
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//    }
//
//    /**
//     * 反序列化
//     * @param s
//     * @throws java.io.IOException
//     * @throws ClassNotFoundException
//     */
//    private void readObject(java.io.ObjectInputStream s)
//            throws java.io.IOException, ClassNotFoundException {
//        elementData = EMPTY_ELEMENTDATA;
//
//        // Read in size, and any hidden stuff
//        s.defaultReadObject();
//
//        // Read in capacity
//        s.readInt(); // ignored
//
//        if (size > 0) {
//            // be like clone(), allocate array based upon size not capacity
//            ensureCapacityInternal(size);
//
//            Object[] a = elementData;
//            // Read in all elements in the proper order.
//            for (int i=0; i<size; i++) {
//                a[i] = s.readObject();
//            }
//        }
//    }


}
