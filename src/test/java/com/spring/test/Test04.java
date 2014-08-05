package com.spring.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test04 {

    public static int i = 0;

    public static void main(String[] args) {

        ScheduledExecutorService threadPoll = Executors.newScheduledThreadPool(10);

        threadPoll.scheduleWithFixedDelay(new Runnable() {

            public void run() {
                System.out.println("begin...");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(++i);
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("end...");
            }
        }, 5, 2, TimeUnit.SECONDS);

    }

}
