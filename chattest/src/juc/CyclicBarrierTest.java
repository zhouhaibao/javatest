package juc;

import java.util.concurrent.CyclicBarrier;

/**
 * @author zhouhaibao 可以用于多线程计算数据，最后合并计算结果的场景。例如，用一个Excel保 存了用户所有银行流水，每个Sheet保存一个账户近一年的每笔银行流水，现在需要统计用户 的日均银行流水，先用多线程处理每个sheet里的银行流水，都执行完之后，得到每个sheet的日 均银行流水，最后，再用barrierAction用这些线程的计算结果，计算出整个Excel的日均银行流 水
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
