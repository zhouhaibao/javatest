package juc.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author zhouhaibao
 * @date 2020/12/15 14:04
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
