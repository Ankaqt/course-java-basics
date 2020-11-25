package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkerThread implements Runnable {
    private boolean isActive = true;
    private CommonResource commonResource;

    public WorkerThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        while (isActive) {
            long seconds = 0;
            if (commonResource.deque.peek() != null) {
                seconds = commonResource.deque.pollFirst();
                try {
                    Thread.sleep(seconds * 1000);
                    System.out.println("I slept " + seconds + " seconds");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
