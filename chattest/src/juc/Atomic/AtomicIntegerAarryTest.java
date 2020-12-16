package juc.Atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author zhouhaibao
 * @date 2020/12/16 11:10
 */
public class AtomicIntegerAarryTest {
    static int[] value=new int[]{1, 2};
    static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        atomicIntegerArray.getAndSet(0, 3);
        System.out.println(atomicIntegerArray.get(0));
        System.out.println(value[0]);
    }
}
