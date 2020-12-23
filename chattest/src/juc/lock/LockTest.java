package juc.lock;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhouhaibao
 * @date 2020/12/16 11:25
 */
public class LockTest implements Runnable {
    static int index = 20;

    Lock lock = new ReentrantLock();

    @SneakyThrows
    @Override
    public void run() {
        lock.lockInterruptibly();
        while (index > 0) {
            System.out.println("消费第" + index + "个产品");
            index--;
        }
    }

    public static void main(String[] args) {
        LockTest test = new LockTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        Thread t4 = new Thread(test);
        Thread t5 = new Thread(test);
        Thread t6 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }

}