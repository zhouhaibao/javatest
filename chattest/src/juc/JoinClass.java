package juc;

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

/**
 * @author zhouhaibao
 * @date 2020/12/14 15:12
 */
public class JoinClass {

    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1执行");
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2执行");
            }
        });
        thread.start();
        thread1.start();
        //thread.join();
        //thread1.join();
        System.out.println("all parser finish");
    }

}
