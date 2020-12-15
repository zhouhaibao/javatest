package juc.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author zhouhaibao
 * @date 2020/12/15 10:54
 */
public class Damen {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements Runnable {
        @Override
        public void run() {
            try {
                second(10);
            } finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
