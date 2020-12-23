package juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author zhouhaibao
 * @date 2020/12/18 14:33
 */
public class CountDownTest {

    public  static void main(String[] args) throws InterruptedException {
        List<String> list=new ArrayList<>();
        list.add("aa");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (String s : list) {
            System.out.println(s);
            countDownLatch.countDown();
        }
        countDownLatch.await();
        System.out.println("结束");


       /* for (String s : list) {
            System.out.println(s);
        }
        System.out.println("结束");*/
    }
}
