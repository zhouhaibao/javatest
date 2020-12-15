package juc;

import java.util.concurrent.CyclicBarrier;

/**
 * @author zhouhaibao
 * @date 2020/12/14 16:16
 */
public class CyclicBarrierTest {
    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                    int numberWaiting = c.getNumberWaiting();
                    System.out.println(numberWaiting);
                } catch (Exception e) {
                }
                System.out.println(1);
            }
        }).start();
        try {
            int numberWaiting = c.getNumberWaiting();
            System.out.println(numberWaiting);
            boolean broken = c.isBroken();
            System.out.println(broken);
            c.await();
        } catch (Exception e) {
        }
        System.out.println(2);
        boolean broken = c.isBroken();
        System.out.println(broken);
    }
}
