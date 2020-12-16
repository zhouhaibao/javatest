package juc.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhouhaibao
 * @date 2020/12/16 10:26
 */
public class AtomicIntegerTest {
    static int i=1;
    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
        i++;
        System.out.println(i);
    }
}
