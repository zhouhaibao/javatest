package juc.concurrentPro;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhouhaibao
 * @date 2020/12/16 11:25
 */
public class ThreadPro implements Runnable{

    static AtomicInteger ai = new AtomicInteger(1);
    @Override
    public void run() {
        while (ai.get()<21){
            System.out.println("消费第"+ai+"个产品");
            ai.getAndIncrement();
        }
    }

    public static void main(String[] args) {
        ThreadPro test = new ThreadPro();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        Thread t4 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
